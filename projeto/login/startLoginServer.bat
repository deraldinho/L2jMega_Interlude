@echo off
title L2jMega loginserver console
:start
SET PATH="C:\Program Files\Java\jdk-11.0.4\bin"
java -Xmx32m -cp ./libs/*; com.l2jmega.loginserver.L2LoginServer
if ERRORLEVEL 2 goto restart
if ERRORLEVEL 1 goto error
goto end
:restart
echo.
echo Admin have restarted, please wait.
echo.
goto start
:error
echo.
echo Server have terminated abnormaly.
echo.
:end
echo.
echo Server terminated.
echo.
pause
