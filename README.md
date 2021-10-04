# HelloMaven

## Overview

* Basic Java project for Maven.


## Description

1. Build Java project with Maven.
2. Static analysis.
3. Unit test with coverage report.

## Requirement

* Java SDK 1.8.0
* [Maven](https://maven.apache.org) 3.8.2
* [MySQL](https://www.mysql.com) 8.0

## Usage

* Basic command.

~~~
$ mvn site
~~~

* Run and export all reports.

~~~
$ mvn clean pmd:pmd findbugs:findbugs jacoco:prepare-agent test jacoco:report site
~~~

* See the update candidates of libraries.

~~~
$ mvn versions:display-dependency-updates
~~~


### Jenkins

* Enable "Run Headless" mode on.

## Install

* None

## Licence

* Copyright &copy; 2016-2021 yusami
* Licensed under the [Apache License, Version 2.0][Apache]

[Apache]: http://www.apache.org/licenses/LICENSE-2.0


## Author

* [yusami](https://github.com/yusami)
