#include <stdio.h>
#include <string.h>
void reverseString(char str[]) {
    int n = strlen(str);
    int start = 0, end = n - 1;
    
    while (start < end) {
        // Swap characters at start and end positions
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
        
        start++;
        end--;
    }
}
int main() {
    char str[] = "Hello, World!";
    
    printf("Original String: %s\n", str);
    
    reverseString(str);
    
    printf("Reversed String: %s\n", str);
    
    return 0;
}
