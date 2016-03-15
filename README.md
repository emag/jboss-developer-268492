# jboss-developer-268492

https://developer.jboss.org/thread/268492

## Usage

1. Startup WildFly
2. Do `mvn wildfly:deploy`
3. GET http://localhost:8080/jboss-developer-268492/myrest/greeting

If you want to use SecondBean, pass the System property `use.second=true` .

``` sh
$ $WILDFLY_HOME/bin/standalone.sh -Duse.second=true
```