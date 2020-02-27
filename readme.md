Para executar basta rodar o comando:
`mvn clean install | egrep -v "(^\[INFO\])" && java -jar target/lib/junit-platform-console-standalone-1.6.0.jar --classpath target/test-classes --scan-classpath`