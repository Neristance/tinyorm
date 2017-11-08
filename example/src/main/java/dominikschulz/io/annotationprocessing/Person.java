package dominikschulz.io.annotationprocessing;


import dominikschulz.io.tinyorm.Field;

public class Person {

    @Field(columnName = PersonDBContract.COLUMN_ID)
    long id;

    @Field(columnName = PersonDBContract.COLUMN_NAME)
    String name;

    @Field(columnName = PersonDBContract.COLUMN_EMAIL)
    String email;

    @Field(columnName = PersonDBContract.COLUMN_AGE)
    Integer age;
}
