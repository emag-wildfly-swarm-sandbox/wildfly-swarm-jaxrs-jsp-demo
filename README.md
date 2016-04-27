# wildfly-swarm-jaxrs-jsp-demo

A WildFly Swarm Demo provide a JAX-RS API and processing JSP.

## Usage

###  Run the app

``` sh
$ ./mvnw clean wildfly-swarm:run
```

### Access API

``` sh
$ curl localhost:8080/api
{"value":"Hello"}
```

### Access JSP

``` sh
$ curl localhost:8080          


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="UTF-8">
  <title>Hello</title>
</head>
<body>
2016-04-28T00:20:59.260
</body>
</html>%       
```
