package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <title>MODESTA CALCULATOR</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/calculator.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.jqplot.css\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/raphael-min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/g.raphael-min.js\"></script>\n");
      out.write("        <script src=\"js/g.bar-min.js\"></script>\n");
      out.write("        <script src=\"js/g.dot-min.js\"></script>\n");
      out.write("        <script src=\"js/g.line-min.js\"></script>\n");
      out.write("        <script src=\"js/g.pie-min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\"></script>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"box\">\n");
      out.write("\n");
      out.write("                <form>\n");
      out.write("\n");
      out.write("                    <h2>Input Numbers</h2>\n");
      out.write("                    <input id=\"input\" class=\"inputbox\" type=\"text\"/> \n");
      out.write("                    <button type=\"button\" id=\"calculate\" class=\"button\" onclick=\"calculate_function();\">Calculate</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <h3>Central Tendecy</h3>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Mean\">Mean</input><br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Median\">Median</input><br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Mode\">Mode(Multiple)</input>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <h3>Dispersion</h3>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"SD\">Standard Deviation</input><br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Variance\">Variance</input><br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Range\">Range</input><br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"IQR\">Inter-Quartile Range</input><br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"COV\">Coefficient of Variation</input>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <h3>Coefficients</h3>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Skewness\">Skewness</input><br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Kurtosis\">Kurtosis</input>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <h3>Percentiles</h3>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Percentile\">Percentile/Percentile Rank</input>\n");
      out.write("                    Value: <input id=\"input2\" class=\"inputbox\" type=\"text\"/> \n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Quartile\">Quartile</input><br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Decile\">Decile</input>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <h3>Visuals</h3>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Histogram\">Histogram</input><br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Boxplot\">Boxplot with inner and outer fences</input><br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Scatterplot\">Scatterplot</input><br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"FDT\">Frequency Distribution Table</input><br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Pie\">Pie Chart</input><br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Bar\">Bar Graph</input><br>\n");
      out.write("                    <input type=\"radio\" class=\"radio_button\" name=\"option\" value=\"Line\">Line Graph</input>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"box2\">\n");
      out.write("\n");
      out.write("                <h2>Results</h2>\n");
      out.write("\n");
      out.write("                <input type=\"text\" id=\"answer\">\n");
      out.write("                <div id=\"chart_div\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            function calculate_function() {\n");
      out.write("\n");
      out.write("                var input = $(\"#input\").val();\n");
      out.write("                var option = $(\"input[name='option']:checked\").val();\n");
      out.write("                var a = input.split(\",\");\n");
      out.write("                var b = $(\"#input2\").val();\n");
      out.write("                var i, ans = 0;\n");
      out.write("                var array = [];\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                for (i = 0; i < a.length; i++) {\n");
      out.write("\n");
      out.write("                    a[i] = parseInt(a[i], 10);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                switch (option) {\n");
      out.write("\n");
      out.write("                    case 'Mean':\n");
      out.write("                        ans = getMean(a);\n");
      out.write("                        $(\"#answer\").val(ans);\n");
      out.write("                        break;\n");
      out.write("                    case 'Median':\n");
      out.write("                        ans = getMedian(a);\n");
      out.write("                        $(\"#answer\").val(ans);\n");
      out.write("                        break;\n");
      out.write("                    case 'Mode':\n");
      out.write("                        array = getMode(a);\n");
      out.write("                        $(\"#answer\").val(array);\n");
      out.write("                        break;\n");
      out.write("                    case 'SD':\n");
      out.write("                        ans = getStandardDev(a);\n");
      out.write("                        $(\"#answer\").val(ans);\n");
      out.write("                        break;\n");
      out.write("                    case 'Variance':\n");
      out.write("                        ans = getVariance(a);\n");
      out.write("                        $(\"#answer\").val(ans);\n");
      out.write("                        break;\n");
      out.write("                    case 'Range' :\n");
      out.write("                        ans = getRange(a);\n");
      out.write("                        $(\"#answer\").val(ans);\n");
      out.write("                        break;\n");
      out.write("                    case 'IQR' :\n");
      out.write("                        ans = getIQR(a);\n");
      out.write("                        $(\"#answer\").val(ans);\n");
      out.write("                        break;\n");
      out.write("                    case 'COV' :\n");
      out.write("                        ans = getCOV(a);\n");
      out.write("                        $(\"#answer\").val(ans);\n");
      out.write("                        break;\n");
      out.write("                    case 'Skewness' :\n");
      out.write("                        ans = getSkewness(a);\n");
      out.write("                        $(\"#answer\").val(ans);\n");
      out.write("                        break;\n");
      out.write("                    case 'Kurtosis' :\n");
      out.write("                        ans = getKurtosis(a);\n");
      out.write("                        $(\"#answer\").val(ans);\n");
      out.write("                        break;\n");
      out.write("                    case 'Percentile' :\n");
      out.write("                        ans = getPercentile(a, b);\n");
      out.write("                        $(\"#answer\").val(ans);\n");
      out.write("                        break;\n");
      out.write("                    case 'Quartile' :\n");
      out.write("                        ans = getQuartile(a);\n");
      out.write("                        $(\"#answer\").val(ans);\n");
      out.write("                        break;\n");
      out.write("                    case 'Decile' :\n");
      out.write("                        ans = getDecile(a);\n");
      out.write("                        $(\"#answer\").val(ans);\n");
      out.write("                        break;\n");
      out.write("                    case 'Histogram' :\n");
      out.write("                        drawHistogram(a);\n");
      out.write("                        // idk;\n");
      out.write("                        break;\n");
      out.write("                    case 'Boxplot' :\n");
      out.write("                        ans = drawBoxPlot(a);\n");
      out.write("                        // idk;\n");
      out.write("                        break;\n");
      out.write("                    case 'Scatterplot':\n");
      out.write("                        ans = drawScatterplot(a);\n");
      out.write("                        //idk;\n");
      out.write("                        break;\n");
      out.write("                    case 'FDT':\n");
      out.write("                        ans = drawFDT(a);\n");
      out.write("                        //idk;\n");
      out.write("                        break;\n");
      out.write("                    case 'Pie':\n");
      out.write("                        drawPie(a);\n");
      out.write("                        $(\"#graphs\").val(r);\n");
      out.write("                        break;\n");
      out.write("                    case 'Bar':\n");
      out.write("                        ans = drawBar(a);\n");
      out.write("                        //idk;\n");
      out.write("                        break;\n");
      out.write("                    case 'Line':\n");
      out.write("                        ans = drawLine(a);\n");
      out.write("                        //idk;\n");
      out.write("                        break;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            function getMean(a) {\n");
      out.write("\n");
      out.write("                var i;\n");
      out.write("                var ans = 0, temp = 0;\n");
      out.write("                for (i = 0; i < a.length; i++) {\n");
      out.write("\n");
      out.write("                    temp += a[i];\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                ans = temp / a.length;\n");
      out.write("                return ans;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function getMedian(a) {\n");
      out.write("\n");
      out.write("                var i, j, temp = 0;\n");
      out.write("                var ans = 0;\n");
      out.write("                var checkEven = (a.length % 2);\n");
      out.write("                for (i = 0; i < (a.length - 1); i++) {\n");
      out.write("                    for (j = 0; j < (a.length - i); j++) {\n");
      out.write("                        if (a[j] > a[j + 1]) {\n");
      out.write("                            temp = a[j];\n");
      out.write("                            a[j] = a[j + 1];\n");
      out.write("                            a[j + 1] = temp;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (checkEven == 0) {\n");
      out.write("                    ans = (a[parseInt((a.length / 2))] + a[parseInt((a.length / 2) - 1)]) / 2;\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    ans = a[parseInt((a.length / 2))];\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                return ans;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function getMode(a) {\n");
      out.write("\n");
      out.write("                var ans = \"\", temp = 0, count = 0, counts = 0;\n");
      out.write("                var maxValue = 0, maxCount = 0;\n");
      out.write("                var i, j, k = 0, l;\n");
      out.write("                var array = [];\n");
      out.write("                var temparray = [];\n");
      out.write("                for (i = 0; i < a.length; i++) {\n");
      out.write("                    count = 0;\n");
      out.write("                    for (j = 0; j < a.length; j++) {\n");
      out.write("                        if (a[j] === a[i])\n");
      out.write("                            count++;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if (count > maxCount) {\n");
      out.write("                        maxCount = count;\n");
      out.write("                        maxValue = a[i];\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                //loop again\n");
      out.write("                for (i = 0; i < a.length; i++) {\n");
      out.write("                    count = 0;\n");
      out.write("                    for (j = 0; j < a.length; j++) {\n");
      out.write("                        if (a[j] === a[i])\n");
      out.write("                            count++;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if (count === maxCount) {\n");
      out.write("                        array[k] = a[i];\n");
      out.write("                        k++;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                var x = 0;\n");
      out.write("                for (l = 0; l < array.length; l++) {\n");
      out.write("                    temp = array[l];\n");
      out.write("                    temparray[ x ] = array[l];\n");
      out.write("                    if (temparray[x] === array[l + 1]) {\n");
      out.write("                        l++;\n");
      out.write("                        x++;\n");
      out.write("                    } else {\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                for (l = 0; l < temparray.length; l++) {\n");
      out.write("                    ans += temparray[l] + \", \";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                return ans;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function getStandardDev(a) {\n");
      out.write("\n");
      out.write("                var i, j, k;\n");
      out.write("                var ans = 0, mean = 0, temp = 0, temp2 = 0;\n");
      out.write("                var array = [];\n");
      out.write("                mean = getMean(a);\n");
      out.write("                for (i = 0; i < a.length; i++) {\n");
      out.write("\n");
      out.write("                    array[i] = a[i] - mean;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                for (j = 0; j < a.length; j++) {\n");
      out.write("\n");
      out.write("                    temp2 += (array[j] * array[j]);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                ans = Math.sqrt((temp2 / a.length));\n");
      out.write("                return ans;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function getVariance(a) {\n");
      out.write("\n");
      out.write("                var ans = 0;\n");
      out.write("                ans = (getStandardDev(a) * getStandardDev(a));\n");
      out.write("                return ans;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function getRange(a) {\n");
      out.write("\n");
      out.write("                var ans = 0, high = 0, low = 0;\n");
      out.write("                var i;\n");
      out.write("                low = a[0];\n");
      out.write("                for (i = 0; i < a.length; i++) {\n");
      out.write("\n");
      out.write("                    if (a[i] > high) {\n");
      out.write("\n");
      out.write("                        high = a[i];\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if (a[i] < low) {\n");
      out.write("\n");
      out.write("                        low = a[i];\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                ans = high - low;\n");
      out.write("                return ans;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function getIQR(a) {\n");
      out.write("\n");
      out.write("                var i;\n");
      out.write("                var ans = 0, temp = 0;\n");
      out.write("                for (i = 0; i < (a.length - 1); i++) {\n");
      out.write("                    for (j = 0; j < (a.length - i); j++) {\n");
      out.write("                        if (a[j] > a[j + 1]) { // sort\n");
      out.write("                            temp = a[j];\n");
      out.write("                            a[j] = a[j + 1];\n");
      out.write("                            a[j + 1] = temp;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // get third quartile\n");
      out.write("                var third = 0.75 * (a.length + 1);\n");
      out.write("                //get first quartile\n");
      out.write("                var first = 0.25 * (a.length + 1);\n");
      out.write("                ans = third - first;\n");
      out.write("                return ans;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function getCOV(a) {\n");
      out.write("\n");
      out.write("                var ans = 0;\n");
      out.write("                ans = getStandardDev(a) / getMean(a);\n");
      out.write("                return ans;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function getSkewness(a) {\n");
      out.write("\n");
      out.write("                var ans = 0, temp = 0;\n");
      out.write("                var i, j;\n");
      out.write("                var array = [];\n");
      out.write("                for (i = 0; i < a.length; i++) {\n");
      out.write("\n");
      out.write("                    array[i] = Math.pow((a[i] - getMean(a)) / getStandardDev(a), 3);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                for (j = 0; j < a.length; j++) {\n");
      out.write("\n");
      out.write("                    temp += array[j];\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                ans = (temp / a.length);\n");
      out.write("                return ans;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function getKurtosis(a) {\n");
      out.write("\n");
      out.write("                var ans = 0, temp = 0;\n");
      out.write("                var i, j;\n");
      out.write("                var array = [];\n");
      out.write("                for (i = 0; i < a.length; i++) {\n");
      out.write("\n");
      out.write("                    array[i] = Math.pow((a[i] - getMean(a)) / getStandardDev(a), 4);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                for (j = 0; j < a.length; j++) {\n");
      out.write("\n");
      out.write("                    temp += array[j];\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                ans = (temp / a.length);\n");
      out.write("                return ans;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function getPercentile(a, b) {\n");
      out.write("\n");
      out.write("                var ans = 0, temp = 0;\n");
      out.write("                var i, j;\n");
      out.write("                var array = [];\n");
      out.write("                var below = 0;\n");
      out.write("                var samescore = 0;\n");
      out.write("                //sort\n");
      out.write("                for (i = 0; i < a.length; i++) {\n");
      out.write("                    for (j = 0; j < (a.length - i); j++) {\n");
      out.write("                        if (a[j] > a[j + 1]) {\n");
      out.write("                            temp = a[j];\n");
      out.write("                            a[j] = a[j + 1];\n");
      out.write("                            a[j + 1] = temp;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                for (i = 0; i < a.length; i++) {\n");
      out.write("                    if (a[i] < b) { // lower than value\n");
      out.write("                        below++;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                for (i = 0; i < a.length; i++) {\n");
      out.write("                    if (a[i] == b) {\n");
      out.write("                        samescore++;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                ans = (below + (0.5 * samescore)) / a.length;\n");
      out.write("                //ans = below;\n");
      out.write("                return ans * 100;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function getQuartile(a) {\n");
      out.write("\n");
      out.write("                var ans;\n");
      out.write("                var sum = 0;\n");
      out.write("                for (i = 0; i < (a.length - 1); i++) {\n");
      out.write("                    for (j = 0; j < (a.length - i); j++) {\n");
      out.write("                        if (a[j] > a[j + 1]) { // sort\n");
      out.write("                            temp = a[j];\n");
      out.write("                            a[j] = a[j + 1];\n");
      out.write("                            a[j + 1] = temp;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                for (i = 0; i < a.length; i++) {\n");
      out.write("                    sum += a[i];\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var ans1, ans2, ans3;\n");
      out.write("                var first = a.length * 25 / 100;\n");
      out.write("                if ((first + .5) - first >= .5) {\n");
      out.write("                    first = parseInt(first) + 1;\n");
      out.write("                } else {\n");
      out.write("                    first = first;\n");
      out.write("                }\n");
      out.write("                ans1 = a[first - 1];\n");
      out.write("                var second = a.length * 50 / 100;\n");
      out.write("                if ((second + .5) - second >= .5) {\n");
      out.write("                    second = parseInt(second) + 1;\n");
      out.write("                } else {\n");
      out.write("                    second = second;\n");
      out.write("                }\n");
      out.write("                ans2 = a[second - 1];\n");
      out.write("\n");
      out.write("                var third = a.length * 75 / 100;\n");
      out.write("                if ((third + .5) - third >= .5) {\n");
      out.write("                    third = parseInt(third) + 1;\n");
      out.write("                } else {\n");
      out.write("                    third = third;\n");
      out.write("                }\n");
      out.write("                ans3 = a[third - 1];\n");
      out.write("                ans = \"Q1: \" + ans1 + \" || Q2: \" + ans2 + \" || Q3: \" + ans3;\n");
      out.write("                // hindi ko alam pano ididisplay :(\n");
      out.write("                return ans;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function getDecile(a) {\n");
      out.write("                var ans;\n");
      out.write("                var sum = 0;\n");
      out.write("                for (i = 0; i < (a.length - 1); i++) {\n");
      out.write("                    for (j = 0; j < (a.length - i); j++) {\n");
      out.write("                        if (a[j] > a[j + 1]) { // sort\n");
      out.write("                            temp = a[j];\n");
      out.write("                            a[j] = a[j + 1];\n");
      out.write("                            a[j + 1] = temp;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                for (i = 0; i < a.length; i++) {\n");
      out.write("                    sum += a[i];\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, ans10;\n");
      out.write("                var index = a.length * 10 / 100;\n");
      out.write("                if ((index + .5) - index >= .5) {\n");
      out.write("                    index = parseInt(index) + 1;\n");
      out.write("                } else {\n");
      out.write("                    index = index;\n");
      out.write("                }\n");
      out.write("                ans1 = a[index - 1];\n");
      out.write("                index = a.length * 20 / 100;\n");
      out.write("                if ((index + .5) - index >= .5) {\n");
      out.write("                    index = parseInt(index) + 1;\n");
      out.write("                } else {\n");
      out.write("                    index = index;\n");
      out.write("                }\n");
      out.write("                ans2 = a[index - 1];\n");
      out.write("                index = a.length * 30 / 100;\n");
      out.write("                if ((index + .5) - index >= .5) {\n");
      out.write("                    index = parseInt(index) + 1;\n");
      out.write("                } else {\n");
      out.write("                    index = index;\n");
      out.write("                }\n");
      out.write("                ans3 = a[index - 1];\n");
      out.write("                index = a.length * 40 / 100;\n");
      out.write("                if ((index + .5) - index >= .5) {\n");
      out.write("                    index = parseInt(index) + 1;\n");
      out.write("                } else {\n");
      out.write("                    index = index;\n");
      out.write("                }\n");
      out.write("                ans4 = a[index - 1];\n");
      out.write("                index = a.length * 50 / 100;\n");
      out.write("                if ((index + .5) - index >= .5) {\n");
      out.write("                    index = parseInt(index) + 1;\n");
      out.write("                } else {\n");
      out.write("                    index = index;\n");
      out.write("                }\n");
      out.write("                ans5 = a[index - 1];\n");
      out.write("                index = a.length * 60 / 100;\n");
      out.write("                if ((index + .5) - index >= .5) {\n");
      out.write("                    index = parseInt(index) + 1;\n");
      out.write("                } else {\n");
      out.write("                    index = index;\n");
      out.write("                }\n");
      out.write("                ans6 = a[index - 1];\n");
      out.write("                index = a.length * 70 / 100;\n");
      out.write("                if ((index + .5) - index >= .5) {\n");
      out.write("                    index = parseInt(index) + 1;\n");
      out.write("                } else {\n");
      out.write("                    index = index;\n");
      out.write("                }\n");
      out.write("                ans7 = a[index - 1];\n");
      out.write("                index = a.length * 80 / 100;\n");
      out.write("                if ((index + .5) - index >= .5) {\n");
      out.write("                    index = parseInt(index) + 1;\n");
      out.write("                } else {\n");
      out.write("                    index = index;\n");
      out.write("                }\n");
      out.write("                ans8 = a[index - 1];\n");
      out.write("                index = a.length * 90 / 100;\n");
      out.write("                if ((index + .5) - index >= .5) {\n");
      out.write("                    index = parseInt(index) + 1;\n");
      out.write("                } else {\n");
      out.write("                    index = index;\n");
      out.write("                }\n");
      out.write("                ans9 = a[index - 1];\n");
      out.write("                index = a.length * 100 / 100;\n");
      out.write("                if ((index + .5) - index >= .5) {\n");
      out.write("                    index = parseInt(index) + 1;\n");
      out.write("                } else {\n");
      out.write("                    index = index;\n");
      out.write("                }\n");
      out.write("                ans10 = a[index - 1];\n");
      out.write("                ans = \"D1: \" + ans1 +\n");
      out.write("                        \" || D2: \" + ans2 +\n");
      out.write("                        \" || D3: \" + ans3 +\n");
      out.write("                        \" || D4: \" + ans4 +\n");
      out.write("                        \" || D5: \" + ans5 +\n");
      out.write("                        \" || D6: \" + ans6 +\n");
      out.write("                        \" || D7: \" + ans7 +\n");
      out.write("                        \" || D8: \" + ans8 +\n");
      out.write("                        \" || D9: \" + ans9 +\n");
      out.write("                        \" || D10: \" + ans10;\n");
      out.write("                // hindi ko alam pano ididisplay :(\n");
      out.write("                return ans;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            var barsVisualization;\n");
      out.write("\n");
      out.write("            function drawHistogram(a) {\n");
      out.write("                var i = 0;\n");
      out.write("                var frequencycount = [];\n");
      out.write("                var temp = 0;\n");
      out.write("                var data = [];\n");
      out.write("                var count = 0;\n");
      out.write("                var k = 0;\n");
      out.write("\n");
      out.write("                for (i = 0; i < a.length; i++) {\n");
      out.write("                    temp = a[i];\n");
      out.write("                    for (j = 0; j < a.length; j++) {\n");
      out.write("                        if (temp === a[j]) {\n");
      out.write("                            count++;\n");
      out.write("                            frequencycount[k] = count;\n");
      out.write("                            data[k] = temp;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    k++;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                System.out.println(k);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function drawBoxplot(a) {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function drawScatterplot(a) {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function drawFDT(a) {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function drawPie(a) {\n");
      out.write("\n");
      out.write("                var paper = Raphael('chart_div');\n");
      out.write("\n");
      out.write("                paper.piechart(\n");
      out.write("                        100, // pie center x coordinate\n");
      out.write("                        100, // pie center y coordinate\n");
      out.write("                        90, // pie radius\n");
      out.write("                        [18.373, 18.686, 2.867, 23.991, 9.592, 9.213] // values\n");
      out.write("                        );\n");
      out.write("                ");
System.out.println("AYOKO NA");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function drawBar(a) {\n");
      out.write("                var paper = Raphael('chart_div');\n");
      out.write("                r.barchart(0, 0, 620, 260, [76, 70, 67, 71, 69], {})\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function drawLine(a) {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function draw1(a) {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
