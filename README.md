# HelloMaven
====

## Overview

* Basic Java project with Maven.


## Description

1. Build Java project with Maven.
2. Static analysis.
3. Unit test with coverage report.

## Requirement

* Java SDK 1.8
* Maven 3.3.9

## Usage

* Basic command.

~~~
mvn site
~~~

* Run and export all reports.

~~~
mvn clean pmd:pmd findbugs:findbugs cobertura:cobertura -Dcobertura.report.format=xml site
~~~

### Jenkins
* Enable "Run Headless" mode on.

## Install

* None

## Licence

* Copyright &copy; 2016-2017 yusami
* Licensed under the [Apache License, Version 2.0][Apache]

[Apache]: http://www.apache.org/licenses/LICENSE-2.0


## Author

* [yusami](https://github.com/yusami)
