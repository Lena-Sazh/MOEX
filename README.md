<p align="right">
<a href="https://visitor-badge-reloaded.herokuapp.com/badge?page_id=Lena-sazh.MOEX&color=E1113A&style=plastic&logo=Github&text=Hello_Visitors!">
  <img src="https://visitor-badge-reloaded.herokuapp.com/badge?page_id=Lena-sazh.MOEX&color=E1113A&style=plastic&logo=Github&text=Hello_Visitors!"/>
</a>
</p>

![MOEX logo](https://github.com/Lena-Sazh/MOEX/blob/master/src/test/resources/images/MOEX_logo_en.jpg)

## Test Automation Project :chart_with_upwards_trend: *(now in progress)*
  
### Simple automated UI and API tests examples for <a href="https://moex.com">MOEX website</a>
____

*DISCLAIMER*

*This project does not contain any confidential information, so it cannot be a matter of GDPR breach or any other legal abuse concern*
____

### :hammer_and_pick: Project stack

<code><img height="50" title="IntelliJ IDEA" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Intelij_IDEA.svg"></code>
<code><img height="50" title="Java" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Java.svg"></code>
<code><img height="50" title="JUnit 5" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/JUnit5.svg"></code>
<code><img height="50" title="Gradle" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Gradle.svg"></code>
<code><img height="50" title="Selenide" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Selenide.svg"></code>
<code><img height="50" title="GitHub" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Github.svg"></code>
<code><img height="50" title="Jenkins" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Jenkins.svg"></code>
<code><img height="50" title="Selenoid" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Selenoid.svg"></code>
<code><img height="50" title="Allure Report" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Allure_Report.svg"></code>
<code><img height="50" title="Allure TestOps" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Allure_EE.svg"></code>
<code><img height="50" title="Telegram" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Telegram.svg"></code>
____

<!--

:pushpin:

### :gear: Jenkins job
To run <a href="https://jenkins.autotests.cloud/job/SovaCapital_Tests/">job</a> we can choose "Run with parameters" option and pass **target params** for tests

![Jenkins job](https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Jenkins_params.png)
  
Or we can use these commands:
  
#### - with filled remote.properties:
```bash
gradle clean test
```

#### - without filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

#### - serve Allure report:
```bash
allure serve build/allure-results
```
____  

### :bar_chart: Allure Report

After each test run we have detailed report about recent and previous test executions with test artifacts, attachments, history and graphs
  
#### Overview 

![Allure overview](https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Overview.png)
  
#### Suites

![Allure suites](https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Report.png)

#### Timelines

![Allure timeline](https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Timeline.png)

#### Attachments
  
![Allure attachments](https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Allure_Attach.png)


### :card_index_dividers: Allure TestOps

Here we also can see detailed information about test runs, but in addition we can manage test cases and create new ones
  
#### Test Cases
  
![Allure test cases](https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/TestCases.png)

  
#### Dashboard
  
![Allure dashboard](https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Dashboard.png)

  
#### Graphs
  
![Allure graph](https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Graph.png)

  
#### Launches
  
![Allure launches](https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Launches.png)

  
### :mailbox: Telegram Bot

Test results are also send by Telegram bot as notifications with clickable link to Allure report
  
![Telegram bot](https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Bot.png)


### :arrow_forward: Video report example

And finally there is a short video report of test case execution
  
![Video report](https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Video.gif)

-->
