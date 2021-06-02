/*
 * This is a comment
 */

package com.blueoptima.analyzers;


import java.util.*;
import java.io.*;


/**
 * created by  on 14/02/2020
 */
public class NpmAnalyzer {

  public static final String PACKAGE_JSON = "package.json";
  public static final String PACKAGE_LOCK_JSON = "package-lock.json";
  private static final String ERR_FAILED_TO_PARSE_JSON = "Failed to parse JSON";
  private static final int BATCH_SIZE = 10;

  public NpmEvidence analyzeFile(final String filePath, final ProcessType processType) {
    return null;
  }
}
