# Knote

Knote is a Simple Note management Spring Boot applicaiton. Wher you can create and delete Notes.

## Installation

After downloading project zip, simple import into your fav IDE as Maven Project.

## Usage


```

Go to - 
src/main/resources/application.properties

1. For running on localhost - 
 - Uncomment
   #spring.datasource.url=jdbc:mysql://localhost:3306/per - for localhost only

2. For deploying on docker - dont comment out below line of code.
   spring.datasource.url=jdbc:mysql://mysqldb/per

3. I used mysqldb (container) for mysql docker image in docker.

4. I will be updating a docker-compose file for making easy to deploy and run on docker.

5. There's a use case - (will be fixed)
   - when you run your application for the first time, there will be no data in the database
   - to overcome this, a dummy note will be inserted in the noteList, which will be displayed on the homepage
   - after creating one note, that note will not be visible.

```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change. 

Please make sure to update tests as appropriate. 

## License
[MIT](https://choosealicense.com/licenses/mit/)
