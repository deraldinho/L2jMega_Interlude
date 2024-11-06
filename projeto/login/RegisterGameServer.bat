@echo off
title aCis gameserver registration console
@java -Djava.util.logging.config.file=config/console.cfg -cp ./libs/*; com.l2jmega.gsregistering.GameServerRegister
@pause
