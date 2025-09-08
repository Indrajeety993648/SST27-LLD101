
package com.example.video;

import java.nio.file.Path;
import java.util.Objects;

public class VideoPipelineFacade {
    public Path process(Path src, Path out, boolean gray, Double scale, Integer sharpenStrength) {
        Objects.requireNonNull(src);
        Objects.requireNonNull(out);
        Decoder decoder = new Decoder();
        FilterEngine filter = new FilterEngine();
        Encoder encoder = new Encoder();
        Frame[] frames = decoder.decode(src);
        if (gray)
            frames = filter.grayscale(frames);
        if (scale != null)
            frames = filter.scale(frames, scale);
        if (sharpenStrength != null) {
            SharpenAdapter sharpen = new SharpenAdapter(new LegacySharpen());
            frames = sharpen.sharpen(frames, sharpenStrength);
        }
        return encoder.encode(frames, out);
    }
}
