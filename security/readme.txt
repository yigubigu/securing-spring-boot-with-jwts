curl -H "Content-Type: application/json" -X POST -d '{"username":"admin","password":"123456"}' http://127.0.0.1:8080/login

curl -H "Content-Type: application/json" -H "Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJhdXRob3JpdGllcyI6IlJPTEVfQURNSU4sQVVUSF9XUklURSIsInN1YiI6ImFkbWluIiwiZXhwIjoxNDk0MTY4MTg5fQ.A5lbDE6bHoTUMOEPfPmPzLUSmmK4UpAfDT1MoTVIlnvSrmX6RU4KLOVIZh452mXC8HkWjHfvzHGP-Q1OIz6WZw" http://127.0.0.1:8080/users
