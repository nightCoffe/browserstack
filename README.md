
# The test automation project for mobile App
<p align="center">
  <img src="images/logo/wikipedia.jpg">
</p>

___
## The project technologies:

![](images/logo/Intelij_IDEA.png)
![](images/logo/Java.png)
![](images/logo/Gradle.png)
![](images/logo/JUnit5.png)
![](images/logo/Appium.png)
![](images/logo/Selenide.png)
![](images/logo/Selenoid.png)
![](images/logo/Allure_Report.png)
![](images/logo/allureTestOps.png)
![](images/logo/Browserstack.png)
![](images/logo/Github.png)
![](images/logo/Jenkins.png)
![](images/logo/Rest-Assured.png)
<img src="https://github.com/nightCoffe/browserstack/blob/main/images/logo/androidstudio.png?raw=true" width="40">

___

## Run tests from terminal locally

### Run tests on Browserstack:

```bash
gradle clean test -DdeviceHost=browserstack
```

### Run tests on Selenoid:

```bash
gradle clean test -DdeviceHost=selenoid
```

### Serve report:

```bash
allure serve build/allure-results
```

___

## Results

The test results can be found in:
+ [Jenkins](#jenkins)
+ [Allure Report](#allure-report)
+ [Allure TestOps](#allure-testOps)
+ [Browserstack](#browserstack)


### Jenkins

[Jenkins job](https://jenkins.autotests.cloud/job/009-mobile/)

<p align="center">
  <img src="images/screenshot/jenkinsMobile.JPG">
</p>

<p align="center">
  <img src="images/screenshot/jenkinsMobile1.JPG">
</p>

### Allure Report


:arrow_right: [The launch with results](https://jenkins.autotests.cloud/job/009-mobile/13/allure/)

<p align="center">
  <img src="images/screenshot/allureReportMobile.JPG">
</p>

:arrow_right: [The launch with results](https://jenkins.autotests.cloud/job/009-mobile/13/allure/#suites/42705f4251334b4912ec0934c5e29e1e/110680a52795233e/)

<p align="center">
  <img src="images/screenshot/allureReportMobile1.JPG">
</p>

### Allure TestOps

<p align="center">
  <img src="images/screenshot/allureTestOpsMobile.JPG">
</p>

<p align="center">
  <img src="images/screenshot/allureTestOpsMobile1.JPG">
</p>

<p align="center">
  <img src="images/screenshot/allureTestOpsMobile2.JPG">
</p>

___

## Browserstack

<p align="center">
  <img src="images/screenshot/browserstack.JPG">
</p>

<p align="center">
  <img src="images/screenshot/browserstack2.JPG">
</p>

### Video the test run in Browserstack.


<p align="center">
  <img src="images/video/browserstack.gif">
</p>

___
