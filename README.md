# CMPE_328_HW1
CMPE 328 Homework 1 - Basic user registry application with RESTful api.
## Running
To run the application just download the project and open as maven project in any editor.

To see the web version one can visit [deployed version](https://cmpe328-homework1.herokuapp.com/).
## Test
### Used Commands
Commands are for windows terminal. So it may not work on any other one. To fix this issue one may change " to ' and \\" to ".

To test the localhost version I used the codes below.
```
curl -X POST localhost:8080 -H "Content-type:application/json" -d "{\"name\": \"Ahmet\", \"surName\": \"Biyik\", \"email\": \"abiyik@hotmail.com\"}"
curl -X POST localhost:8080 -H "Content-type:application/json" -d "{\"name\": \"Ayse\", \"surName\": \"Torun\", \"email\": \"atorun@hotmail.com\"}"
curl -X POST localhost:8080 -H "Content-type:application/json" -d "{\"name\": \"Mehmet\", \"surName\": \"Gormus\", \"email\": \"mgormus@hotmail.com\"}"
curl -X POST localhost:8080 -H "Content-type:application/json" -d "{\"name\": \"Mustafa\", \"surName\": \"Yildirim\", \"email\": \"myildirim@hotmail.com\"}"
curl -X GET localhost:8080
curl -X GET localhost:8080/1
curl -X GET localhost:8080/5
curl -X DELETE localhost:8080/4
curl -X GET localhost:8080
curl -X PUT localhost:8080/3 -H "Content-type:application/json" -d "{\"name\": \"Kerem\"}"
curl -X PUT localhost:8080/3 -H "Content-type:application/json" -d "{\"name\": \"Talat\", \"surName\": \"Kar\"}"
curl -X PUT localhost:8080/3 -H "Content-type:application/json" -d "{\"name\": \"Etem\", \"surName\": \"Halat\", \"email\": \"ehalat@hotmail.com\"}"
```

To test the deployed version one may use the codes below.
```
curl -X POST https://cmpe328-homework1.herokuapp.com/ -H "Content-type:application/json" -d "{\"name\": \"Ahmet\", \"surName\": \"Biyik\", \"email\": \"abiyik@hotmail.com\"}"
curl -X POST https://cmpe328-homework1.herokuapp.com/ -H "Content-type:application/json" -d "{\"name\": \"Ayse\", \"surName\": \"Torun\", \"email\": \"atorun@hotmail.com\"}"
curl -X POST https://cmpe328-homework1.herokuapp.com/ -H "Content-type:application/json" -d "{\"name\": \"Mehmet\", \"surName\": \"Gormus\", \"email\": \"mgormus@hotmail.com\"}"
curl -X POST https://cmpe328-homework1.herokuapp.com/ -H "Content-type:application/json" -d "{\"name\": \"Mustafa\", \"surName\": \"Yildirim\", \"email\": \"myildirim@hotmail.com\"}"
curl -X GET https://cmpe328-homework1.herokuapp.com/
curl -X GET https://cmpe328-homework1.herokuapp.com/1
curl -X GET https://cmpe328-homework1.herokuapp.com/5
curl -X DELETE https://cmpe328-homework1.herokuapp.com/4
curl -X GET https://cmpe328-homework1.herokuapp.com/
curl -X PUT https://cmpe328-homework1.herokuapp.com/3 -H "Content-type:application/json" -d "{\"name\": \"Kerem\"}"
curl -X PUT https://cmpe328-homework1.herokuapp.com/3 -H "Content-type:application/json" -d "{\"name\": \"Talat\", \"surName\": \"Kar\"}"
curl -X PUT https://cmpe328-homework1.herokuapp.com/3 -H "Content-type:application/json" -d "{\"name\": \"Etem\", \"surName\": \"Halat\", \"email\": \"ehalat@hotmail.com\"}"
```
### Screenshots
First initilization
![First Initilization Console](https://user-images.githubusercontent.com/40427109/111711688-5687ab80-885d-11eb-831b-114142bf03df.png)![Fully changed user 3](https://user-images.githubusercontent.com/40427109/111712706-3bb63680-885f-11eb-992a-6fc8981a1f41.png)

![First Initilization](https://user-images.githubusercontent.com/40427109/111711741-715a2000-885d-11eb-96f4-b75d979e9f5b.png)

After 4 post request
![After 4 Post Request](https://user-images.githubusercontent.com/40427109/111711922-baaa6f80-885d-11eb-8a2b-d0251445329f.png)
Getting only user 1

![Getting only user 1](https://user-images.githubusercontent.com/40427109/111711968-d44bb700-885d-11eb-835b-75f8b1198daf.png)

Trying to invoke non-existed user (5)

![Trying to Invoke Non-existed User](https://user-images.githubusercontent.com/40427109/111712063-fb09ed80-885d-11eb-81d9-49534a98cb8c.png)

After deletion of user 4
![After Deletion](https://user-images.githubusercontent.com/40427109/111712402-9c913f00-885e-11eb-8db2-8f9b18ad9803.png)
After only name has changed

![After only name change](https://user-images.githubusercontent.com/40427109/111712494-ca768380-885e-11eb-9eb4-1c53813401e3.png)

After name and surname have changed

![After Name and surname Change](https://user-images.githubusercontent.com/40427109/111712560-eaa64280-885e-11eb-942d-d17bd48a9789.png)

After all changed

![Fully changed user 3](https://user-images.githubusercontent.com/40427109/111712733-47a1f880-885f-11eb-9846-64287556c211.png)

Last state
![Last State](https://user-images.githubusercontent.com/40427109/111712777-60aaa980-885f-11eb-8afb-cba654fdab23.png)

Console commands
![Console Commands](https://user-images.githubusercontent.com/40427109/111712818-78822d80-885f-11eb-8f95-3dad377a2d65.png)
