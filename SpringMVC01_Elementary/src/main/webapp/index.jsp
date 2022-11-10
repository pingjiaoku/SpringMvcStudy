<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

</head>
<body>
<input type="button" value="tijiao" onclick="postJson()">
</body>
<script src="jquery.js"></script>
<script>
  function postJson(){
      var settings = {
          "url": "http://localhost:8080/SpringMVC01_Elementary/save8",
          "method": "POST",
          "timeout": 0,
          "headers": {
              "Content-Type": "application/json"
          },
          "data": JSON.stringify([
              {
                  "name": "dongadong",
                  "age": 21,
                  "book": {
                      "id": 12,
                      "name": "shuming"
                  }
              },
              {
                  "name": "dongadong",
                  "age": 21,
                  "book": {
                      "id": 12,
                      "name": "shuming"
                  }
              }
          ]),
      };

      $.ajax(settings).done(function (response) {
          console.log(response);
      });
  }
</script>
</html>