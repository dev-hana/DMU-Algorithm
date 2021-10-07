#include <stdio.h>
#include <string.h>
#include <stdlib.h>
 
char input[20];
char plan[100];
 
int x = 1, y = 1;
int dx[4] = {0, 0, -1, 1};
int dy[4] = {-1, 1, 0, 0};
char moveTypes[4] = {'L', 'R', 'U', 'D'};
char *token;
char *ptr = moveTypes;
 
int main(void)
{
    fgets(input, sizeof(input), stdin);
    fgets(plan, sizeof(plan), stdin);
    int n = atoi(input);
    token = strtok(plan, " ");
    while (token != NULL)
    {
        int nx = -1, ny = -1;
        for (int i = 0; i < 4; i++)
        {
            if (*token == ptr[i])
            {
                nx = x + dx[i];
                ny = y + dy[i];
            }
        }
        token = strtok(NULL, " ");      
        if (nx < 1 || ny < 1 || nx > n || ny > n)
            continue;
 
        x = nx;
        y = ny;
    }
    printf("%d %d", x, y);
    return 0;
}