The hello-world project

<div align="center">
    <img src="./assets/images/json-utils.png"/>
</div>


## Project structure
```
.
├── json-utils
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

- Build project

```shell script
$ ./mvnw clean package
[INFO] 
[INFO] Json Utils ......................................... SUCCESS [  7.427 s]
[INFO] Parent ............................................. SUCCESS [  0.014 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.579 s
[INFO] Finished at: 2022-07-27T10:11:13+07:00
[INFO] ------------------------------------------------------------------------
```

- Run project

```shell script
$ cd json-utils
$ ../mvnw spring-boot:run
...
{"object_id":1,"object_name":"A"}
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.817 s
[INFO] Finished at: 2022-07-27T10:23:39+07:00
[INFO] ------------------------------------------------------------------------
```

## Contribute

## Reference
- https://www.baeldung.com/jackson-annotations
- https://www.baeldung.com/jackson-object-mapper-tutorial