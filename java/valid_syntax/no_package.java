/*
 * This is a comment
 */


import com.blueoptima.common.ProcessType;
import com.blueoptima.dto.NpmEvidence;
import com.blueoptima.dto.PackageJson;
import com.blueoptima.dto.PackageLockJson;
import com.blueoptima.parser.JsonParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.util.*;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static com.blueoptima.ci.SCAAnalyserSharedLogger.getExtractionLogger;
import static com.blueoptima.common.ProcessType.isPackageJson;
import static com.blueoptima.common.ProcessType.isPackageLockJson;
import static com.blueoptima.npm.NpmInlineDependencyParser.validInline;
import static java.lang.String.format;
import static java.util.Collections.emptySet;
import static java.util.Objects.isNull;

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
