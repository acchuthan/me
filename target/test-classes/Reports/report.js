$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/DealsDirect.feature");
formatter.feature({
  "name": "To validate login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Verify the wishlist functionality by selecting the product and adding to0 the wishlist",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user is in the Deals direct home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_the_Deals_direct_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user mouseover to the mens category available in the homepage",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_mouseover_to_the_mens_category_available_in_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selected the footware option available in the MEN catergory",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_selected_the_footware_option_available_in_the_MEN_catergory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to navigated to the footwear page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_navigated_to_the_footwear_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selected the Brand ,Size and pricefilter",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_selected_the_Brand_Size_and_pricefilter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user set the price limits from the horizontal scrollbar",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_set_the_price_limits_from_the_horizontal_scrollbar()"
});
formatter.result({
  "error_message": "org.openqa.selenium.interactions.MoveTargetOutOfBoundsException: move target out of bounds\n  (Session info: chrome\u003d88.0.4324.150)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ACCHUTHAN\u0027, ip: \u0027192.168.43.110\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.150, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:58632}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 84eccdc0c14222e80c319c9c5cb99a2c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:618)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:639)\r\n\tat org.openqa.selenium.interactions.Actions.perform(Actions.java:595)\r\n\tat org.stepdefinition.StepDefinition.user_set_the_price_limits_from_the_horizontal_scrollbar(StepDefinition.java:154)\r\n\tat ✽.user set the price limits from the horizontal scrollbar(file:src/test/resources/FeatureFile/DealsDirect.feature:38)\r\n",
  "status": "failed"
});
});