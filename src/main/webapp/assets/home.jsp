
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../common/taglib.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Midterm JavaWeb</title>
    <!--Font awsomes-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" type="text/css" href='${pageContext.request.contextPath}/assets/css/style.css'/>


</head>

<body>
<div class="app">

    <div class="background gradient">
        <ul class="bg-bubbles">
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>
    </div>


    <div class="profile">
        <div class="container content">


            <div class="header">
                <nav class="nav_link">
                    <li>
                        <a href="#" class="fas fa-stream">

                        </a>
                    </li>
                    <li>
                        <a href="#" class="fas fa-user">
                            <p>about </p>
                        </a>
                    </li>
                    <li>
                        <a href="#" class="fas fa-clipboard">
                            <p>resume </p>
                        </a>
                    </li>
                    <li>
                        <a href="#" class="fas fa-fire-alt">
                            <p>works </p>
                        </a>
                    </li>
                    <li>
                        <a href="#" class="fas fa-comment-dots">
                            <p>blog </p>
                        </a>
                    </li>
                    <li>
                        <a href="#" class="fas fa-at">
                            <p>contact </p>
                        </a>
                    </li>
                    <li>
                        <a href="#" class="fab fa-github">
                            <p>Git </p>
                        </a>
                    </li>
                </nav>
            </div>
            <div class="main">
                <div class="member">
                    <div class="member__img">
                        <img src="${pageContext.request.contextPath}/assets/images/pro1.png" alt="Image 1">
                    </div>
                    <div class="member__infor">
                        <h3>Tống Văn Nam</h3>
                        <h4>19110094</h4>
                        <div class="link_social ">
                            <li>
                                <a href="#" class="fab fa-facebook">                            </a>
                            </li>
                            <li>
                                <a href="#" class="fab fa-github">                            </a>
                            </li>
                            <li>
                                <a href="#" class="far fa-envelope"></a>                     </a>
                            </li>
                        </div>
                    </div>

                </div>
                <div class="member">
                    <div class="member__img">
                        <img src="${pageContext.request.contextPath}/assets/images/pro2.png" alt="Image 2">
                    </div>
                    <div class="member__infor">
                        <h3>Đặng Văn Thông</h3>
                        <h4>19110094</h4>
                        <div class="link_social ">
                            <li>
                                <a href="#" class="fab fa-facebook">                            </a>
                            </li>
                            <li>
                                <a href="#" class="fab fa-github">                            </a>
                            </li>
                            <li>
                                <a href="#" class="far fa-envelope"></a>                     </a>
                            </li>
                        </div>
                    </div>

                </div>
                <div class="member">
                    <div class="member__img">
                        <img src="${pageContext.request.contextPath}/assets/images/pro3.png" alt="Image 3">
                    </div>
                    <div class="member__infor">
                        <h3>Huỳnh Thanh Dũng</h3>
                        <h4>19110094</h4>
                        <div class="link_social ">
                            <li>
                                <a href="#" class="fab fa-facebook">                            </a>
                            </li>
                            <li>
                                <a href="#" class="fab fa-github">                            </a>
                            </li>
                            <li>
                                <a href="#" class="far fa-envelope"></a>                     </a>
                            </li>
                        </div>
                    </div>

                </div>


            </div>
            <div class="show" >
                <h3>List Assignment :</h3>
                <ol class="container">


                    <li><a href="/ch04_ex1_survey" target="_blank">Chap 4 Ex 1 (Survey)</a></li>
                    <li><a href="/ch05_ex1_ex2_email" target="_blank">Chap 5 Ex 1 and 2 (EmaiList and Test) </a></li>
                    <li><a href="/ch06_ex1_email" target="_blank">Chap 6 Ex1 (EmailList) </a></li>
                    <li><a href="/ch06_ex2_survey" target="_blank">Chap 6 Ex2 (Survey) </a></li>
                    <li><a href="/ch07_ex1_ex2_download" target="_blank">Chap 7 Ex1 and 2 </a></li>
                    <li><a href="/ch07_ex3_cart" target="_blank">Chap 7 Ex3 </a></li>
                    <li><a href="/ch08_ex1_email" target="_blank">Chap 8 Ex1 </a></li>
                    <li><a href="/ch12_ex1_sqlGateway" target="_blank">Chap 12 Ex1 </a></li>
                    <li><a href="/userAdmin" target="_blank">Chap 12 Ex2 </a></li>

                </ol>

            </div>
        </div>
    </div>


</div>
</body>

</html>