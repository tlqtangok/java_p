run:
	#export CLASS_PATH=.:$CLASS_PATH
	@javac jd_0/c_0.java
	#@java jd_0.c_0

	@javac jd_1/c_1.java
	@java jd_1.c_1

	@javac -cp .:./jd_2/:./jars/jedis-2.9.0.jar ./jd_2/hello_redis.java 
	@java  -cp .:./jd_2/:./jars/jedis-2.9.0.jar hello_redis 



clean:
	@find . -name '*.class' | xargs rm 
	
