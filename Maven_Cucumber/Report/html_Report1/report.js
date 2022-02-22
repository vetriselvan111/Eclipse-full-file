$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Automation_Feat.feature");
formatter.feature({
  "line": 1,
  "name": "To order Dresses in My store Application",
  "description": "",
  "id": "to-order-dresses-in-my-store-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login",
  "description": "",
  "id": "to-order-dresses-in-my-store-application;login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@AP1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Email id In Email id Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Sign in Button And It Navigates To The Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation_StepDef.user_Launch_The_Application()"
});
formatter.result({
  "duration": 11405570701,
  "status": "passed"
});
formatter.match({
  "location": "Automation_StepDef.user_Enter_The_Email_id_In_Email_id_Field()"
});
formatter.result({
  "duration": 137533901,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//input[@type\u003d\u0027text\u0027])[3]\"}\n  (Session info: chrome\u003d94.0.4606.61)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-FGT7HP3\u0027, ip: \u0027192.168.43.42\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 94.0.4606.61, chrome: {chromedriverVersion: 94.0.4606.61 (418b78f5838ed..., userDataDir: C:\\Users\\Guru\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:61031}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f300fc4a910abf4777524c83cdfe0003\n*** Element info: {Using\u003dxpath, value\u003d(//input[@type\u003d\u0027text\u0027])[3]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat base_Class.Base_class.sendKeysElement(Base_class.java:100)\r\n\tat com.automation.stepdefinition.Automation_StepDef.user_Enter_The_Email_id_In_Email_id_Field(Automation_StepDef.java:33)\r\n\tat ✽.When user Enter The Email id In Email id Field(src/test/java/com/adactin/feature/Automation_Feat.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Automation_StepDef.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Automation_StepDef.user_Click_On_The_Sign_in_Button_And_It_Navigates_To_The_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
});