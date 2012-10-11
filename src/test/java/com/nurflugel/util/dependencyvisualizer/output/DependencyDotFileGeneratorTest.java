package com.nurflugel.util.dependencyvisualizer.output;

import com.nurflugel.util.dependencyvisualizer.parser.GradleDependencyParser;
import com.nurflugel.util.gradlescriptvisualizer.ui.GradleScriptPreferences;
import com.nurflugel.util.test.TestResources;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;
import static com.nurflugel.util.dependencyvisualizer.output.DependencyDotFileGenerator.createDotFileFromLines;

/** Created with IntelliJ IDEA. User: douglas_bullard Date: 10/3/12 Time: 13:03 To change this template use File | Settings | File Templates. */
@Test(groups = "unit")
public class DependencyDotFileGeneratorTest
{
  public void testCreateOutput() throws Exception {}

  public void testWriteOutput() throws Exception {}

  public void testReplaceBadChars() throws Exception {}

  public void testReadFile1() throws IOException
  {
    String                  filePath       = TestResources.getFilePath("gradle/dependencies/Das_dependencies.txt");
    List<String>            lines          = FileUtils.readLines(new File(filePath));
    GradleDependencyParser  parser         = new GradleDependencyParser();
    GradleScriptPreferences preferences    = new GradleScriptPreferences();
    String                  outputFileName = "das_dibble.dot";
    File                    fileFromLines  = createDotFileFromLines(parser, preferences, outputFileName, lines.toArray(new String[lines.size()]));
  }

  public void testCreateOutputForFile() throws Exception
  {
    File file = new File("/Users/douglas_bullard/Documents/JavaStuff/Google_Code/gradle-script-visualizer/trunk/build.gradle");  // todo parameterize

    DependencyDotFileGenerator.createOutputForFile(file, new GradleDependencyParser(), new GradleScriptPreferences(), "dibble.dot");
  }
}