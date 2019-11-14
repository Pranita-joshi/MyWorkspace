$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Pranita Joshi"
    }
  ],
  "line": 3,
  "name": "Login Functionality",
  "description": "I want to verify login page functionality for Quore web application",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 11357167800,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I navigate to Quore Web application url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I verify login page title",
  "rows": [
    {
      "cells": [
        "Title"
      ],
      "line": 9
    },
    {
      "cells": [
        "Login | Quore"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.groovy:38"
});
formatter.result({
  "duration": 3065004100,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.groovy:43"
});
formatter.result({
  "duration": 63097600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify application version",
  "description": "",
  "id": "login-functionality;verify-application-version",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@first"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I verify application Logo is present",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I verify application version is present",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.groovy:97"
});
formatter.result({
  "duration": 661946700,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.groovy:103"
});
formatter.result({
  "duration": 68234600,
  "status": "passed"
});
formatter.after({
  "duration": 746940200,
  "status": "passed"
});
formatter.before({
  "duration": 9444060900,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I navigate to Quore Web application url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I verify login page title",
  "rows": [
    {
      "cells": [
        "Title"
      ],
      "line": 9
    },
    {
      "cells": [
        "Login | Quore"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.groovy:38"
});
formatter.result({
  "duration": 2601818100,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.groovy:43"
});
formatter.result({
  "duration": 8789200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify user authentication with valid username \u0026 password",
  "description": "",
  "id": "login-functionality;verify-user-authentication-with-valid-username-\u0026-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@second"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I enter valid username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I verify home page of application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.groovy:50"
});
formatter.result({
  "duration": 14776300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.groovy:56"
});
formatter.result({
  "duration": 127200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.groovy:62"
});
formatter.result({
  "duration": 97300,
  "status": "passed"
});
formatter.after({
  "duration": 734074200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 24,
  "name": "Verify user authentication with invalid username and/or password",
  "description": "",
  "id": "login-functionality;verify-user-authentication-with-invalid-username-and/or-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@third"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I enter \"\u003cusername\u003e\" username and \"\u003cpassword\u003e\" password",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify \"\u003cerror\u003e\" error message",
  "keyword": "And "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "login-functionality;verify-user-authentication-with-invalid-username-and/or-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "error"
      ],
      "line": 30,
      "id": "login-functionality;verify-user-authentication-with-invalid-username-and/or-password;;1"
    },
    {
      "cells": [
        "pranita",
        "testing",
        "Oops! Your Quore ID or password is incorrect."
      ],
      "line": 31,
      "id": "login-functionality;verify-user-authentication-with-invalid-username-and/or-password;;2"
    },
    {
      "cells": [
        "p",
        "t",
        "Oops! Your Quore ID or password is incorrect."
      ],
      "line": 32,
      "id": "login-functionality;verify-user-authentication-with-invalid-username-and/or-password;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9455349700,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I navigate to Quore Web application url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I verify login page title",
  "rows": [
    {
      "cells": [
        "Title"
      ],
      "line": 9
    },
    {
      "cells": [
        "Login | Quore"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.groovy:38"
});
formatter.result({
  "duration": 4768394100,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.groovy:43"
});
formatter.result({
  "duration": 12747500,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Verify user authentication with invalid username and/or password",
  "description": "",
  "id": "login-functionality;verify-user-authentication-with-invalid-username-and/or-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    },
    {
      "line": 23,
      "name": "@third"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I enter \"pranita\" username and \"testing\" password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify \"Oops! Your Quore ID or password is incorrect.\" error message",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "pranita",
      "offset": 9
    },
    {
      "val": "testing",
      "offset": 32
    }
  ],
  "location": "LoginPageSteps.groovy:68"
});
formatter.result({
  "duration": 1063301000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.groovy:74"
});
formatter.result({
  "duration": 140344800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Oops! Your Quore ID or password is incorrect.",
      "offset": 10
    }
  ],
  "location": "LoginPageSteps.groovy:79"
});
formatter.result({
  "duration": 2106593100,
  "status": "passed"
});
formatter.after({
  "duration": 711704600,
  "status": "passed"
});
formatter.before({
  "duration": 9368371800,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I navigate to Quore Web application url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I verify login page title",
  "rows": [
    {
      "cells": [
        "Title"
      ],
      "line": 9
    },
    {
      "cells": [
        "Login | Quore"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.groovy:38"
});
formatter.result({
  "duration": 3223589600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.groovy:43"
});
formatter.result({
  "duration": 9786500,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Verify user authentication with invalid username and/or password",
  "description": "",
  "id": "login-functionality;verify-user-authentication-with-invalid-username-and/or-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    },
    {
      "line": 23,
      "name": "@third"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I enter \"p\" username and \"t\" password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify \"Oops! Your Quore ID or password is incorrect.\" error message",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "p",
      "offset": 9
    },
    {
      "val": "t",
      "offset": 26
    }
  ],
  "location": "LoginPageSteps.groovy:68"
});
formatter.result({
  "duration": 982475700,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.groovy:74"
});
formatter.result({
  "duration": 122262100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Oops! Your Quore ID or password is incorrect.",
      "offset": 10
    }
  ],
  "location": "LoginPageSteps.groovy:79"
});
formatter.result({
  "duration": 2081073100,
  "status": "passed"
});
formatter.after({
  "duration": 1403485000,
  "status": "passed"
});
formatter.before({
  "duration": 9397685500,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I navigate to Quore Web application url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I verify login page title",
  "rows": [
    {
      "cells": [
        "Title"
      ],
      "line": 9
    },
    {
      "cells": [
        "Login | Quore"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.groovy:38"
});
formatter.result({
  "duration": 2681461700,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.groovy:43"
});
formatter.result({
  "duration": 10405100,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Verify links on Login page",
  "description": "",
  "id": "login-functionality;verify-links-on-login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@fourth"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "I verify links are present and valid on page",
  "rows": [
    {
      "cells": [
        "Forgot password?"
      ],
      "line": 37
    },
    {
      "cells": [
        "Forgot Quore ID?"
      ],
      "line": 38
    },
    {
      "cells": [
        "Learn what Quore can do for your hotel."
      ],
      "line": 39
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.groovy:91"
});
formatter.result({
  "duration": 2918627700,
  "status": "passed"
});
formatter.after({
  "duration": 737000100,
  "status": "passed"
});
});