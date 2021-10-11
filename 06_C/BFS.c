#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define SIZE 50

int visited[9];
int graph[9][3] = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};

typedef struct Queue{
    int items[SIZE];
    int front;
    int rear;
}Queue;

Queue* createQueue();
void enQueue(Queue* queue, int data);
int deQueue(Queue* queue);
int isEmpty(Queue* queue);
int isFull(Queue* queue);
void printQueue(Queue* queue);
void bfs(int start);

Queue* createQueue(){
    Queue* newQueue = (Queue*)malloc(sizeof(Queue));
    newQueue->front = -1;
    newQueue->rear = -1;
    return newQueue;
}

void enQueue(Queue* queue, int data){
    if(isFull(queue)){
        return;
    }else{
        if(queue->front == -1){
            queue->front = 0;
        }
        queue->rear++;
        queue->items[queue->rear] = data;
    }
}

int deQueue(Queue* queue){
    int item = 0;
    if(isEmpty(queue))
        return;
    else{
        if(queue->front > queue->rear){
            queue->front = -1;
            queue->rear = -1;
        }
        item = queue->items[queue->front];
        queue->front++;
    }
    return item;
}

int isEmpty(Queue *queue){
    if(queue->rear == -1) return 1;
    else return 0;
}

int isFull(Queue* queue){
    if(queue->front = 0 && queue->rear == SIZE - 1){
        return 1;
    } 
    else{
        return 0;
    } 
}

void printQueue(Queue* queue){
    int i = 0;
    if(queue->rear == -1) return;
    for(i = queue->front; i<=queue->rear; i++){
        printf("%d", queue->items[i]);
    }
    printf("\n");
}

void bfs(int start){

    Queue* queue = createQueue();
    enQueue(queue, start);
    visited[start] = 1;
    printf("%d ", start);

    while(!isEmpty(queue)){
        int x = deQueue(queue);

        int n = sizeof(graph[x]) / sizeof(int);
        for(int i = 0; i < n; i++){
            int node = graph[x][i];
            if(!visited[node]){
                enQueue(queue, node);
                visited[node] = 1;
                if(node != 0){
                    printf("%d ", node);
                }
            }
        }
    }

}

int main(void) {
    bfs(1); 
    return 0;
}