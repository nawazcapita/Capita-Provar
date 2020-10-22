package reports;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.provar.core.testapi.ITestExecutionContext;
import com.provar.core.testapi.annotations.TestExecutionContext;
import com.provar.core.testapi.annotations.TestRunExporter;
import com.provar.testrunner.AbstractTestRunMonitor;
import com.provar.testrunner.ITestRunExporter;
import com.provar.testrunner.api.IExecutionItem;
import com.provar.testrunner.exporters.TestCaseReportingOptions;

public class TestRunMonitorDemo extends AbstractTestRunMonitor {

	@TestRunExporter
	private ITestRunExporter pdfExporter;
	
	
	@TestRunExporter(mimetype="application/csv")
	private ITestRunExporter csvExporter;
	
	@TestExecutionContext
	private ITestExecutionContext testExec ;

	String pdfPath;
	FileWriter fileWriter = null;
	String fileName = "ProvarTestRunExport";

	static int i = 1;
	TestCaseReportingOptions testCaseReportingOptions = new TestCaseReportingOptions(true, false, true, true, true, true, true, false, true);
	
	File reportsDir ;
		
	public void initialize() {
		reportsDir = new File(testExec.getProjectPath() + File.separator + "Reports");

		if (!reportsDir.exists()) {
			reportsDir.mkdirs();
		}
		pdfPath = this.testExec.getProjectPath();
		try {
			fileWriter = new FileWriter(reportsDir.getAbsoluteFile() + "\\" + fileName + ".csv", false);
			fileWriter.write("run id, started, ended, path, name, successful, skipped, failed, total, failure Message\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void writeTestCaseExecution(IExecutionItem executionItem) {
		try {
			pdfExporter.exportExecutionItem(getRuntimeConfiguration(), pdfPath, executionItem, getTestArtifactsPath(), testCaseReportingOptions, null, false, "pdf",fileWriter, ",", testExec.getRunId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			fileWriter = new FileWriter(reportsDir.getAbsoluteFile() + "\\" + fileName + ".csv", true);
			csvExporter.exportExecutionItem(null, null, executionItem, null, null, null, false, "csv" , fileWriter, ",", testExec.getRunId());	
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	@Override
	public void writeTestRunSummary(IExecutionItem rootExecutionItem) {
		try {
			pdfExporter.exportExecutionItem(getRuntimeConfiguration(), (reportsDir.getAbsoluteFile() + "\\" + "Summary.pdf"), rootExecutionItem, getTestArtifactsPath(), testCaseReportingOptions, null, false, "pdf",fileWriter, ",", testExec.getRunId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			fileWriter = new FileWriter(reportsDir.getAbsoluteFile() + "\\" + fileName + ".csv", true);

			csvExporter.exportExecutionSummary(rootExecutionItem, fileWriter, ",");	
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}