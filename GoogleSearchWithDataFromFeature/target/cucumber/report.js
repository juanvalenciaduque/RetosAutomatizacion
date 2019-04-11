$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/GoogleSearch.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "Juan Diego en el sitio de google",
  "keyword": "Given "
});
formatter.step({
  "name": "El busca la palabra \"\u003cpalabra\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "El verifica que la palabra \"\u003cpalabra\u003e\" este en los resultados",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "palabra"
      ]
    },
    {
      "cells": [
        "switch"
      ]
    },
    {
      "cells": [
        "sophos solutions"
      ]
    },
    {
      "cells": [
        "jdjljlfjdlkfdklm"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Juan Diego en el sitio de google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWithDataFromFeatureStepsDefinitions.juan_Diego_en_el_sitio_de_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El busca la palabra \"switch\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWithDataFromFeatureStepsDefinitions.el_busca_la_palabra(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El verifica que la palabra \"switch\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWithDataFromFeatureStepsDefinitions.el_verifica_que_la_palabra_este_en_los_resultados(String)"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Juan Diego en el sitio de google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWithDataFromFeatureStepsDefinitions.juan_Diego_en_el_sitio_de_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El busca la palabra \"sophos solutions\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWithDataFromFeatureStepsDefinitions.el_busca_la_palabra(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El verifica que la palabra \"sophos solutions\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWithDataFromFeatureStepsDefinitions.el_verifica_que_la_palabra_este_en_los_resultados(String)"
});
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Juan Diego en el sitio de google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWithDataFromFeatureStepsDefinitions.juan_Diego_en_el_sitio_de_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El busca la palabra \"jdjljlfjdlkfdklm\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWithDataFromFeatureStepsDefinitions.el_busca_la_palabra(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El verifica que la palabra \"jdjljlfjdlkfdklm\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWithDataFromFeatureStepsDefinitions.el_verifica_que_la_palabra_este_en_los_resultados(String)"
});
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
});