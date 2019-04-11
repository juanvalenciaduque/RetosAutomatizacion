$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BusquedaGoogle.feature");
formatter.feature({
  "name": "Googgle Search",
  "description": "  I want to search a word in google",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "successful search in google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Juan Diego is on the google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BusquedaGoogleStepdefinition.juan_Diego_is_on_the_google_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he does the search",
  "keyword": "When "
});
formatter.match({
  "location": "BusquedaGoogleStepdefinition.he_does_the_search()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cinput value\u003d\"Buscar con Google\" aria-label\u003d\"Buscar con Google\" name\u003d\"btnK\" type\u003d\"submit\"\u003e is not clickable at point (600, 411). Other element would receive the click: \u003cspan\u003e...\u003c/span\u003e\n  (Session info: chrome\u003d73.0.3683.86)\n  (Driver info: chromedriver\u003d2.46.628402 (536cd7adbad73a3783fdc2cab92ab2ba7ec361e1),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027RC-PC\u0027, ip: \u0027172.23.85.82\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628402 (536cd7adbad73a..., userDataDir: C:\\Users\\SEMILL~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:51255}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 73.0.3683.86, webStorageEnabled: true}\nSession ID: 526a0a1b95e911181a8e0fc1df7d7fea\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat co.com.googleutilities.BasePage.click(BasePage.java:35)\r\n\tat co.com.googlepom.BusquedaGooglePom.RealizarBusqueda(BusquedaGooglePom.java:23)\r\n\tat co.com.google.busquedagooglecucumber.stepsdefinitions.BusquedaGoogleStepdefinition.he_does_the_search(BusquedaGoogleStepdefinition.java:49)\r\n\tat ✽.he does the search(file:src/test/resources/features/BusquedaGoogle.feature:27)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "he validates the result is success",
  "keyword": "Then "
});
formatter.match({
  "location": "BusquedaGoogleStepdefinition.he_validates_the_result_is_success()"
});
formatter.result({
  "status": "skipped"
});
});