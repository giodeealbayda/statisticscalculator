<%-- 
    Document   : newjsp
    Created on : 03 29, 15, 9:50:53 AM
    Author     : Giodee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>

        <title>MODESTA CALCULATOR</title>
        <link rel="stylesheet" href="css/calculator.css">
        <link rel="stylesheet" href="css/jquery.jqplot.css" />

    </head>

    <body>
        <script src="js/jquery.min.js"></script>
        <script src="js/raphael-min.js"></script>

        <script src="js/g.raphael-min.js"></script>
        <script src="js/g.bar-min.js"></script>
        <script src="js/g.dot-min.js"></script>
        <script src="js/g.line-min.js"></script>
        <script src="js/g.pie-min.js"></script>

        <script src="js/custom.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
        <div class="container">

            <div class="box">

                <form>

                    <h2>Input Numbers</h2>
                    <input id="input" class="inputbox" type="text"/> 
                    <button type="button" id="calculate" class="button" onclick="calculate_function();">Calculate</button>


                    <h3>Central Tendecy</h3>
                    <input type="radio" class="radio_button" name="option" value="Mean">Mean</input><br>
                    <input type="radio" class="radio_button" name="option" value="Median">Median</input><br>
                    <input type="radio" class="radio_button" name="option" value="Mode">Mode(Multiple)</input>


                    <h3>Dispersion</h3>
                    <input type="radio" class="radio_button" name="option" value="SD">Standard Deviation</input><br>
                    <input type="radio" class="radio_button" name="option" value="Variance">Variance</input><br>
                    <input type="radio" class="radio_button" name="option" value="Range">Range</input><br>
                    <input type="radio" class="radio_button" name="option" value="IQR">Inter-Quartile Range</input><br>
                    <input type="radio" class="radio_button" name="option" value="COV">Coefficient of Variation</input>


                    <h3>Coefficients</h3>
                    <input type="radio" class="radio_button" name="option" value="Skewness">Skewness</input><br>
                    <input type="radio" class="radio_button" name="option" value="Kurtosis">Kurtosis</input>


                    <h3>Percentiles</h3>
                    <input type="radio" class="radio_button" name="option" value="Percentile">Percentile/Percentile Rank</input>
                    Value: <input id="input2" class="inputbox" type="text"/> 
                    <br>
                    <input type="radio" class="radio_button" name="option" value="Quartile">Quartile</input><br>
                    <input type="radio" class="radio_button" name="option" value="Decile">Decile</input>


                    <h3>Visuals</h3>
                    <input type="radio" class="radio_button" name="option" value="Histogram">Histogram</input><br>
                    <input type="radio" class="radio_button" name="option" value="Boxplot">Boxplot with inner and outer fences</input><br>
                    <input type="radio" class="radio_button" name="option" value="Scatterplot">Scatterplot</input><br>
                    <input type="radio" class="radio_button" name="option" value="FDT">Frequency Distribution Table</input><br>
                    <input type="radio" class="radio_button" name="option" value="Pie">Pie Chart</input><br>
                    <input type="radio" class="radio_button" name="option" value="Bar">Bar Graph</input><br>
                    <input type="radio" class="radio_button" name="option" value="Line">Line Graph</input>

                </form>

            </div>

            <div class="box2">

                <h2>Results</h2>

                <input type="text" id="answer">
                <div id="chart_div"></div>
            </div>

        </div>



        <script>

            function calculate_function() {

                var input = $("#input").val();
                var option = $("input[name='option']:checked").val();
                var a = input.split(",");
                var b = $("#input2").val();
                var i, ans = 0;
                var array = [];



                for (i = 0; i < a.length; i++) {

                    a[i] = parseInt(a[i], 10);
                }


                switch (option) {

                    case 'Mean':
                        ans = getMean(a);
                        $("#answer").val(ans);
                        break;
                    case 'Median':
                        ans = getMedian(a);
                        $("#answer").val(ans);
                        break;
                    case 'Mode':
                        array = getMode(a);
                        $("#answer").val(array);
                        break;
                    case 'SD':
                        ans = getStandardDev(a);
                        $("#answer").val(ans);
                        break;
                    case 'Variance':
                        ans = getVariance(a);
                        $("#answer").val(ans);
                        break;
                    case 'Range' :
                        ans = getRange(a);
                        $("#answer").val(ans);
                        break;
                    case 'IQR' :
                        ans = getIQR(a);
                        $("#answer").val(ans);
                        break;
                    case 'COV' :
                        ans = getCOV(a);
                        $("#answer").val(ans);
                        break;
                    case 'Skewness' :
                        ans = getSkewness(a);
                        $("#answer").val(ans);
                        break;
                    case 'Kurtosis' :
                        ans = getKurtosis(a);
                        $("#answer").val(ans);
                        break;
                    case 'Percentile' :
                        ans = getPercentile(a, b);
                        $("#answer").val(ans);
                        break;
                    case 'Quartile' :
                        ans = getQuartile(a);
                        $("#answer").val(ans);
                        break;
                    case 'Decile' :
                        ans = getDecile(a);
                        $("#answer").val(ans);
                        break;
                    case 'Histogram' :
                        drawHistogram(a);
                        // idk;
                        break;
                    case 'Boxplot' :
                        ans = drawBoxPlot(a);
                        // idk;
                        break;
                    case 'Scatterplot':
                        ans = drawScatterplot(a);
                        //idk;
                        break;
                    case 'FDT':
                        ans = drawFDT(a);
                        //idk;
                        break;
                    case 'Pie':
                        drawPie(a);
                        $("#graphs").val(r);
                        break;
                    case 'Bar':
                        ans = drawBar(a);
                        //idk;
                        break;
                    case 'Line':
                        ans = drawLine(a);
                        //idk;
                        break;
                }


            }



            function getMean(a) {

                var i;
                var ans = 0, temp = 0;
                for (i = 0; i < a.length; i++) {

                    temp += a[i];
                }

                ans = temp / a.length;
                return ans;
            }


            function getMedian(a) {

                var i, j, temp = 0;
                var ans = 0;
                var checkEven = (a.length % 2);
                for (i = 0; i < (a.length - 1); i++) {
                    for (j = 0; j < (a.length - i); j++) {
                        if (a[j] > a[j + 1]) {
                            temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }
                    }
                }

                if (checkEven == 0) {
                    ans = (a[parseInt((a.length / 2))] + a[parseInt((a.length / 2) - 1)]) / 2;
                }
                else {
                    ans = a[parseInt((a.length / 2))];
                }


                return ans;
            }


            function getMode(a) {

                var ans = "", temp = 0, count = 0, counts = 0;
                var maxValue = 0, maxCount = 0;
                var i, j, k = 0, l;
                var array = [];
                var temparray = [];
                for (i = 0; i < a.length; i++) {
                    count = 0;
                    for (j = 0; j < a.length; j++) {
                        if (a[j] === a[i])
                            count++;
                    }

                    if (count > maxCount) {
                        maxCount = count;
                        maxValue = a[i];
                    }
                }


                //loop again
                for (i = 0; i < a.length; i++) {
                    count = 0;
                    for (j = 0; j < a.length; j++) {
                        if (a[j] === a[i])
                            count++;
                    }

                    if (count === maxCount) {
                        array[k] = a[i];
                        k++;
                    }
                }
                var x = 0;
                for (l = 0; l < array.length; l++) {
                    temp = array[l];
                    temparray[ x ] = array[l];
                    if (temparray[x] === array[l + 1]) {
                        l++;
                        x++;
                    } else {
                    }


                }

                for (l = 0; l < temparray.length; l++) {
                    ans += temparray[l] + ", ";
                }

                return ans;
            }


            function getStandardDev(a) {

                var i, j, k;
                var ans = 0, mean = 0, temp = 0, temp2 = 0;
                var array = [];
                mean = getMean(a);
                for (i = 0; i < a.length; i++) {

                    array[i] = a[i] - mean;
                }

                for (j = 0; j < a.length; j++) {

                    temp2 += (array[j] * array[j]);
                }

                ans = Math.sqrt((temp2 / a.length));
                return ans;
            }


            function getVariance(a) {

                var ans = 0;
                ans = (getStandardDev(a) * getStandardDev(a));
                return ans;
            }

            function getRange(a) {

                var ans = 0, high = 0, low = 0;
                var i;
                low = a[0];
                for (i = 0; i < a.length; i++) {

                    if (a[i] > high) {

                        high = a[i];
                    }

                    if (a[i] < low) {

                        low = a[i];
                    }

                }

                ans = high - low;
                return ans;
            }


            function getIQR(a) {

                var i;
                var ans = 0, temp = 0;
                for (i = 0; i < (a.length - 1); i++) {
                    for (j = 0; j < (a.length - i); j++) {
                        if (a[j] > a[j + 1]) { // sort
                            temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }
                    }
                }

                // get third quartile
                var third = 0.75 * (a.length + 1);
                //get first quartile
                var first = 0.25 * (a.length + 1);
                ans = third - first;
                return ans;
            }


            function getCOV(a) {

                var ans = 0;
                ans = getStandardDev(a) / getMean(a);
                return ans;
            }


            function getSkewness(a) {

                var ans = 0, temp = 0;
                var i, j;
                var array = [];
                for (i = 0; i < a.length; i++) {

                    array[i] = Math.pow((a[i] - getMean(a)) / getStandardDev(a), 3);
                }

                for (j = 0; j < a.length; j++) {

                    temp += array[j];
                }

                ans = (temp / a.length);
                return ans;
            }


            function getKurtosis(a) {

                var ans = 0, temp = 0;
                var i, j;
                var array = [];
                for (i = 0; i < a.length; i++) {

                    array[i] = Math.pow((a[i] - getMean(a)) / getStandardDev(a), 4);
                }

                for (j = 0; j < a.length; j++) {

                    temp += array[j];
                }

                ans = (temp / a.length);
                return ans;
            }


            function getPercentile(a, b) {

                var ans = 0, temp = 0;
                var i, j;
                var array = [];
                var below = 0;
                var samescore = 0;
                //sort
                for (i = 0; i < a.length; i++) {
                    for (j = 0; j < (a.length - i); j++) {
                        if (a[j] > a[j + 1]) {
                            temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }
                    }
                }

                for (i = 0; i < a.length; i++) {
                    if (a[i] < b) { // lower than value
                        below++;
                    }
                }

                for (i = 0; i < a.length; i++) {
                    if (a[i] == b) {
                        samescore++;
                    }
                }

                ans = (below + (0.5 * samescore)) / a.length;
                //ans = below;
                return ans * 100;
            }

            function getQuartile(a) {

                var ans;
                var sum = 0;
                for (i = 0; i < (a.length - 1); i++) {
                    for (j = 0; j < (a.length - i); j++) {
                        if (a[j] > a[j + 1]) { // sort
                            temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }
                    }
                }

                for (i = 0; i < a.length; i++) {
                    sum += a[i];
                }

                var ans1, ans2, ans3;
                var first = a.length * 25 / 100;
                if ((first + .5) - first >= .5) {
                    first = parseInt(first) + 1;
                } else {
                    first = first;
                }
                ans1 = a[first - 1];
                var second = a.length * 50 / 100;
                if ((second + .5) - second >= .5) {
                    second = parseInt(second) + 1;
                } else {
                    second = second;
                }
                ans2 = a[second - 1];

                var third = a.length * 75 / 100;
                if ((third + .5) - third >= .5) {
                    third = parseInt(third) + 1;
                } else {
                    third = third;
                }
                ans3 = a[third - 1];
                ans = "Q1: " + ans1 + " || Q2: " + ans2 + " || Q3: " + ans3;
                // hindi ko alam pano ididisplay :(
                return ans;
            }

            function getDecile(a) {
                var ans;
                var sum = 0;
                for (i = 0; i < (a.length - 1); i++) {
                    for (j = 0; j < (a.length - i); j++) {
                        if (a[j] > a[j + 1]) { // sort
                            temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }
                    }
                }

                for (i = 0; i < a.length; i++) {
                    sum += a[i];
                }

                var ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, ans10;
                var index = a.length * 10 / 100;
                if ((index + .5) - index >= .5) {
                    index = parseInt(index) + 1;
                } else {
                    index = index;
                }
                ans1 = a[index - 1];
                index = a.length * 20 / 100;
                if ((index + .5) - index >= .5) {
                    index = parseInt(index) + 1;
                } else {
                    index = index;
                }
                ans2 = a[index - 1];
                index = a.length * 30 / 100;
                if ((index + .5) - index >= .5) {
                    index = parseInt(index) + 1;
                } else {
                    index = index;
                }
                ans3 = a[index - 1];
                index = a.length * 40 / 100;
                if ((index + .5) - index >= .5) {
                    index = parseInt(index) + 1;
                } else {
                    index = index;
                }
                ans4 = a[index - 1];
                index = a.length * 50 / 100;
                if ((index + .5) - index >= .5) {
                    index = parseInt(index) + 1;
                } else {
                    index = index;
                }
                ans5 = a[index - 1];
                index = a.length * 60 / 100;
                if ((index + .5) - index >= .5) {
                    index = parseInt(index) + 1;
                } else {
                    index = index;
                }
                ans6 = a[index - 1];
                index = a.length * 70 / 100;
                if ((index + .5) - index >= .5) {
                    index = parseInt(index) + 1;
                } else {
                    index = index;
                }
                ans7 = a[index - 1];
                index = a.length * 80 / 100;
                if ((index + .5) - index >= .5) {
                    index = parseInt(index) + 1;
                } else {
                    index = index;
                }
                ans8 = a[index - 1];
                index = a.length * 90 / 100;
                if ((index + .5) - index >= .5) {
                    index = parseInt(index) + 1;
                } else {
                    index = index;
                }
                ans9 = a[index - 1];
                index = a.length * 100 / 100;
                if ((index + .5) - index >= .5) {
                    index = parseInt(index) + 1;
                } else {
                    index = index;
                }
                ans10 = a[index - 1];
                ans = "D1: " + ans1 +
                        " || D2: " + ans2 +
                        " || D3: " + ans3 +
                        " || D4: " + ans4 +
                        " || D5: " + ans5 +
                        " || D6: " + ans6 +
                        " || D7: " + ans7 +
                        " || D8: " + ans8 +
                        " || D9: " + ans9 +
                        " || D10: " + ans10;
                // hindi ko alam pano ididisplay :(
                return ans;
            }

            var barsVisualization;

            function drawHistogram(a) {
                var i = 0;
                var frequencycount = [];
                var temp = 0;
                var data = [];
                var count = 0;
                var k = 0;

                for (i = 0; i < a.length; i++) {
                    temp = a[i];
                    for (j = 0; j < a.length; j++) {
                        if (temp === a[j]) {
                            count++;
                            frequencycount[k] = count;
                            data[k] = temp;
                        }
                    }

                    k++;
                }

                System.out.println(k);
            }


            function drawBoxplot(a) {

            }

            function drawScatterplot(a) {

            }

            function drawFDT(a) {

            }

            function drawPie(a) {

                var paper = Raphael('chart_div');
                var i = 0;
                var k = 0;
                var array = [];
                var temp;
                var count = 0;

                for (i = 0; i < a.length; i++) {
                    temp = a[i];
                    for (j = 0; j < a.length; j++) {
                        if (temp === a[j]) {
                            count++;
                            array[k]=a[j];
                        }
                    }
                }

                paper.piechart(
                        100, // pie center x coordinate
                        100, // pie center y coordinate
                        90, // pie radius
                        [18.373, 18.686, 2.867, 23.991, 9.592, 9.213] // values
                        );
            <%System.out.println("AYOKO NA");%>
            }

            function drawBar(a) {
                var paper = Raphael('chart_div');
                r.barchart(0, 0, 620, 260, [76, 70, 67, 71, 69], {})
            }

            function drawLine(a) {

            }

            function draw1(a) {

            }



        </script>

        <script src="js/jquery.js"></script>

        <script src="js/jquery.min.js"></script>


    </body>

</html>
