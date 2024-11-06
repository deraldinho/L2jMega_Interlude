@echo off
title L2jMega gameserver console
:start
REM -------------------------------------
REM Default parameters for a basic server.
SET PATH="C:\Program Files\Java\jdk-11.0.4\bin"
java -Dfile.encoding=UTF8 -Xmx8G -cp ./libs/*; com.l2jmega.gameserver.GameServer
REM -------------------------------------
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
