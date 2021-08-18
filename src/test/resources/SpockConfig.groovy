
spockReports {
   set 'com.athaydes.spockframework.report.showCodeBlocks': true,
       'com.athaydes.spockframework.report.outputDir': 'build/reports/spock',
       'com.athaydes.spockframework.report.aggregatedJsonReportDir': 'build/reports/spock',
       'com.athaydes.spockframework.report.internal.HtmlReportCreator.printThrowableStackTrace': false,
       'com.athaydes.spockframework.report.internal.HtmlReportCreator.specSummaryNameOption': 'title'
}

unroll {
   defaultPattern '#featureName[#iterationIndex]'
}

runner {
  parallel {
    enabled true
    //defaultSpecificationExecutionMode='CONCURRENT'
    defaultSpecificationExecutionMode='SAME_THREAD'
    defaultExecutionMode='SAME_THREAD'
    //defaultExecutionMode='CONCURRENT'
    dynamic(1)
  }
}

