# springboot-validation-exceptionhandling


# To use the App
H2 database is used here and 
goto postman and hit the http://localhost:8080/users/save url using POST method.

try with these payload:
{
    "name":"",
    "email":"joe",
    "mobile":"96856596",
    "gender":"Male",
    "age":66,
    "nationality":null
    
}

app will validate and give below errors:
{
    "nationality": "must not be null",
    "name": "must not be blank",
    "mobile": "Invalid Mobile Number",
    "age": "must be less than or equal to 60",
    "email": "Invalid Email address"
}

If you give valid details User will be saved.
