package com.Java.IO_Stream_and_File_Handling.StreamClass;

public class FileInputStreamE {

}
/*1. int available(): This method is used to get the number of bytes that can be read (or skipped over) from this file input stream without blocking by the next invocation of a method for this input stream.
2. void close(): This method closes the file input stream and releases any system resources associated with the stream.
3. FileDescriptor getFD(): This method returns the FileDescriptor object that represents the association to the actual file in the file system being used by this FileInputStream.
4. int read(): This method reads a byte of data from the input stream.
5. int read(byte[ ] b): This method reads up to b.length bytes of data from the invoking input stream into an array of bytes.
6. int read(byte[ ] b, int n, int m): It reads up to m bytes of data from this input stream into an array of bytes from the nth byte.
7. long skip(long n): This method skips over and discards n bytes of data from the input stream.
*/