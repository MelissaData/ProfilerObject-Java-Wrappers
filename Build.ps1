# Set Java Includes and Profiler Object Library Path
$JavaIncludeDirectory1 = "C:\Program Files\Java\jdk-20\include"
$JavaIncludeDirectory2 = "C:\Program Files\Java\jdk-20\include\win32"
$ProfilerLibraryPath = $PSScriptRoot

# Run cl command
& 'cl' -I"$ProfilerLibraryPath" -I"$JavaIncludeDirectory1" -I"$JavaIncludeDirectory2" -Fe'mdProfilerJavaWrapper.dll' 'mdProfilerJavaWrapper.cpp' -link -DLL -LIBPATH:"$ProfilerLibraryPath" -DEFAULTLIB:'mdProfiler.lib'

# Remove files
Remove-Item 'mdProfilerJavaWrapper.exp' -ErrorAction SilentlyContinue
Remove-Item 'mdProfilerJavaWrapper.obj' -ErrorAction SilentlyContinue
Remove-Item 'mdProfilerJavaWrapper.lib' -ErrorAction SilentlyContinue

