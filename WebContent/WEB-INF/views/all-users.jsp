<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello jQuery</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script>
            $(document).ready(function() {
                $.ajax({
                    url: 'http://localhost:8080/sao-job-search/services/user/getlistuser',
                    method: 'GET',
                    data: {},
                    dataType: 'json',
                    success: function(data) {
                        $i=0;
                        $.each(data, function(index, element) {
                                $i++;
                                $('.users').append('<div>'+$i+', email: '+element.email+', password: '+element.password+', usertype: '+element.usertype+'</div>');
                        });
                    }
                });
            });
        </script>
    </head>

    <body>
        <div>
            <div class="users">Users:</div>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    </body>
</html>