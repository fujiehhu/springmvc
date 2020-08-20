<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>



<div id="bgimg">
</div>
<div>
    <h1>${message}</h1>
    <h1>${rtnMsg}</h1>
    <div id="login-box">

        <form action="loginAction" method="post">
            <div id="name1">
                <span>用户名</span>
                <input type="text" placeholder="用户名" id="name" name="name" >
            </div>
            <div id="passwd">
                <span>密码</span>
                <input type="password" placeholder="密码" id="pwd" name="pwd" >
            </div>

            <div id="login">
                <input type="submit" value="登录">
                <input type="submit" value="注册">
            </div>
        </form>

    </div>
</div>
<style>
    * {
        margin: 0;
        padding: 0;
    }

    html,
    body {
        height: 100%;
        width: 100%;
        background-color: ghostwhite;

    }

    h1 {
        position: absolute;
        left: 50%; /* 定位父级的50% */
        top: 20%;
        transform: translate(-50%, -50%); /*自己的50% */
    }

    #bgimg {
        position: absolute;
        height: 100%;
        width: 100%;
        /*background-image: url("../data/assets/img/bgimg.jpg");*/
        background-size: 100%;
        background-repeat: no-repeat;
        filter: blur(10px);
        /*z-index: -1;*/
    }

    #login-box {
        position: absolute;
        background-color: rgba(123, 123, 123, 0.6);
        /*width: 500px;*/
        /*height: 300px;*/
        left: 50%; /* 定位父级的50% */
        top: 60%;
        transform: translate(-50%, -50%); /*自己的50% */
        border-radius: 20px;
        /*display: flex;*/
        text-align: center;

    }

    #name1 {
        width: 100%;
        float: left;
        text-align: center;
        line-height: 30px;
        margin-top: 30px;
    }

    #passwd {
        width: 100%;
        float: right;
        text-align: center;
        line-height: 30px;
        margin-top: 30px;
    }

    #login {
        width: 100%;
        float: right;
        text-align: center;
        line-height: 30px;
        margin-top: 30px;
    }

    #qr {
        width: 100%;
        float: right;
        margin-top: 30px;
        text-align: center;
    }

    span {
        text-align: left;
    }

    #test {
        font-weight: bold;
        color: #EFEFEF;
    }

</style>