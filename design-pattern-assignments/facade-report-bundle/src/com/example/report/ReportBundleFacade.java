package com.example.report;

import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;

public class ReportBundleFacade {
    public Path export(Map<String, Object> data, Path outDir, String baseName) {
        Objects.requireNonNull(data, "data");
        Objects.requireNonNull(outDir, "outDir");
        Objects.requireNonNull(baseName, "baseName");
        try {
            JsonWriter jw = new JsonWriter();
            Zipper z = new Zipper();
            AuditLog log = new AuditLog();
            Path json = jw.write(data, outDir, baseName);
            Path zip = z.zip(json, outDir.resolve(baseName + ".zip"));
            log.log("exported " + zip);
            return zip;
        } catch (UncheckedIOException e) {
            throw e;
        } catch (Exception e) {
            throw new UncheckedIOException(new java.io.IOException(e));
        }
    }
}
