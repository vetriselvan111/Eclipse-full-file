$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin_Feat.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Ad1"
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
  "name": "user Enter the \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter the \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;login;;1"
    },
    {
      "cells": [
        "A",
        "A@123"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login;;2"
    },
    {
      "cells": [
        "E",
        "E@123"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;login;;3"
    },
    {
      "cells": [
        "Vetriselvan",
        "IO1538"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-application;login;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Ad1"
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
  "name": "user Enter the \"A\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter the \"A@123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Step_Def.user_Launch_The_Application()"
});
formatter.result({
  "duration": 9917602000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A",
      "offset": 16
    }
  ],
  "location": "Adactin_Step_Def.user_Enter_the_In_Username_Field(String)"
});
formatter.result({
  "duration": 1136008199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A@123",
      "offset": 16
    }
  ],
  "location": "Adactin_Step_Def.user_Enter_the_In_Password_Field(String)"
});
formatter.result({
  "duration": 172990001,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 889000000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Ad1"
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
  "name": "user Enter the \"E\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter the \"E@123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Step_Def.user_Launch_The_Application()"
});
formatter.result({
  "duration": 691584299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "E",
      "offset": 16
    }
  ],
  "location": "Adactin_Step_Def.user_Enter_the_In_Username_Field(String)"
});
formatter.result({
  "duration": 200966700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "E@123",
      "offset": 16
    }
  ],
  "location": "Adactin_Step_Def.user_Enter_the_In_Password_Field(String)"
});
formatter.result({
  "duration": 153991900,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 786081600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Ad1"
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
  "name": "user Enter the \"Vetriselvan\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter the \"IO1538\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Step_Def.user_Launch_The_Application()"
});
formatter.result({
  "duration": 535251599,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vetriselvan",
      "offset": 16
    }
  ],
  "location": "Adactin_Step_Def.user_Enter_the_In_Username_Field(String)"
});
formatter.result({
  "duration": 179973200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IO1538",
      "offset": 16
    }
  ],
  "location": "Adactin_Step_Def.user_Enter_the_In_Password_Field(String)"
});
formatter.result({
  "duration": 183833900,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1948630400,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Ad2"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user Select The \"Sydney\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user Select \"Hotel Hervey\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select Room \"Double\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select the Number of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Enter Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Enter Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Select The Adults per Room",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Select The Children per Room",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Click On The Search Button And It Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 17
    }
  ],
  "location": "Adactin_Step_Def.user_Select_The(String)"
});
formatter.result({
  "duration": 841903300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Hervey",
      "offset": 13
    }
  ],
  "location": "Adactin_Step_Def.user_Select(String)"
});
formatter.result({
  "duration": 268883500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Double",
      "offset": 18
    }
  ],
  "location": "Adactin_Step_Def.user_Select_Room(String)"
});
formatter.result({
  "duration": 241775400,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Select_the_Number_of_Rooms()"
});
formatter.result({
  "duration": 477798299,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Enter_Check_In_Date()"
});
formatter.result({
  "duration": 354566400,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Enter_Check_Out_Date()"
});
formatter.result({
  "duration": 179598199,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Select_The_Adults_per_Room()"
});
formatter.result({
  "duration": 297591500,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Select_The_Children_per_Room()"
});
formatter.result({
  "duration": 260363301,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Click_On_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 2133946900,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Select Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@Ad3"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "user Select The CheckBox Button",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user Click On The Continue Button And It Navigates To The Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Step_Def.user_Select_The_CheckBox_Button()"
});
formatter.result({
  "duration": 550982100,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//input[@type\u003d\u0027radio\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-FGT7HP3\u0027, ip: \u0027192.168.43.42\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat base_Class.Base_class.clickOnElement(Base_class.java:96)\r\n\tat com.adactin.stepdefinition.Adactin_Step_Def.user_Select_The_CheckBox_Button(Adactin_Step_Def.java:101)\r\n\tat ???.When user Select The CheckBox Button(src/test/java/com/adactin/feature/Adactin_Feat.feature:33)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Click_On_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 37,
  "name": "Book Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@Ad4"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "user Enter The First Name",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user Enter The Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enter The Address",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Enter The Credit Card No",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Select The Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Select The Expiry Date",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Enter The CVV Number",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user Click On The Book Now Button And It Navigates To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Step_Def.user_Enter_The_First_Name()"
});
formatter.result({
  "duration": 990976600,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d94.0.4606.61)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-FGT7HP3\u0027, ip: \u0027192.168.43.42\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 94.0.4606.61, chrome: {chromedriverVersion: 94.0.4606.61 (418b78f5838ed..., userDataDir: C:\\Users\\Guru\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:56699}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 98c140ecea5fa7202fb0b8ee60941445\n*** Element info: {Using\u003dxpath, value\u003d//input[@name\u003d\u0027first_name\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat base_Class.Base_class.sendKeysElement(Base_class.java:100)\r\n\tat com.adactin.stepdefinition.Adactin_Step_Def.user_Enter_The_First_Name(Adactin_Step_Def.java:113)\r\n\tat ???.When user Enter The First Name(src/test/java/com/adactin/feature/Adactin_Feat.feature:39)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Enter_The_Last_Name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Enter_The_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Enter_The_Credit_Card_No()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Select_The_Credit_Card_Type()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Select_The_Expiry_Date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Enter_The_CVV_Number()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Adactin_Step_Def.user_Click_On_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 49,
  "name": "Booking Confirmation",
  "description": "",
  "id": "hotel-booking-in-adactin-application;booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@Ad5"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "user click My Itinerary Button And It Navigates To The Booking Cancellation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Step_Def.user_click_My_Itinerary_Button_And_It_Navigates_To_The_Booking_Cancellation_Page()"
});
formatter.result({
  "duration": 206761900,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d94.0.4606.61)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-FGT7HP3\u0027, ip: \u0027192.168.43.42\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 94.0.4606.61, chrome: {chromedriverVersion: 94.0.4606.61 (418b78f5838ed..., userDataDir: C:\\Users\\Guru\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:56699}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 98c140ecea5fa7202fb0b8ee60941445\n*** Element info: {Using\u003dxpath, value\u003d//input[@name\u003d\u0027my_itinerary\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat base_Class.Base_class.clickOnElement(Base_class.java:96)\r\n\tat com.adactin.stepdefinition.Adactin_Step_Def.user_click_My_Itinerary_Button_And_It_Navigates_To_The_Booking_Cancellation_Page(Adactin_Step_Def.java:161)\r\n\tat ???.Then user click My Itinerary Button And It Navigates To The Booking Cancellation Page(src/test/java/com/adactin/feature/Adactin_Feat.feature:51)\r\n",
  "status": "failed"
});
});