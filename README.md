# emblem
Test project for REST API and Angular integration.

### Steps to run the program -
1) Browse (curl, browser)- localhost:8080, displays home page.
2) Login page"/login", username = "user", password="password" (in memory userDetail service, generates auth token to continue)
3) Add new person "/embl", shows a editable form, submit makes REST call "postPerson" function which inherantly calls CRUDReposiroty function to save values to in-memory H2 DB. 

#### TODO:
1) Add post login page for add new person.
2) Give link to logoff.
3) Unit test cases.

# TODO: Add more details as progress further.
