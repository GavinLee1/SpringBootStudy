##1.Introduction  
This is a demo project just for studying Spring Boot  
It is a relative simple Model-Cotroller layer project. Do not have a view layer. So you can just simply call the API to visit its functions.  <逗了..我为什么要写英文..>  
- Initial Editor: Eclipse  
- Initial Project Manager: Maven  
- Database: NA `Using mock data`

##2.知识点  
* Spring Boot Application  
* Controller / Service / DAO
* `@RestController @RequestMapping("/students")`  
* `@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)`  
* `@Autowired`  
* `@PathVariable("id")`  
* public void insertStudentToDb(**@RequestBody** Student student)  
* `@ResponseBody`  
* `@Service`  
* `@Autowired @Qualifier("fakeData")`  
* `@Repository @Qualifier("fakeData")`  

##3.初始化Spring Boot 需要用到
####Parent  
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.4.3.RELEASE</version>
	</parent>
####Dependency  
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
