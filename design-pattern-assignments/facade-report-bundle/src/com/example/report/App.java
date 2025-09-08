package com.example.report;

import java.nio.file.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, Object> data = Map.of("name", "Quarterly");
        jsonwriter jw = new JsonWriter();
        Zipper z = new Zipper();
        AuditLog log = new AuditLog();
        ReportBundleFacade facade = new ReportBundleFacade(jw, z, log);
        Path zip = facade.export(data, Path.of("out"), "report");
        System.out.println("DONE " + zip);
    }
}
