@REM Name:     practice.bat
@REM Purpose:  To practice batch file scripting.
@REM Author:   Daniel Ribeirinha-Braga

@echo off

if [%1]==[] (
  echo "Error: Parameters missing"
  echo:
  echo "usage: practice.bat [param]"
  goto :eof
)

