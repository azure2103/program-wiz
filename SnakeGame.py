import pygame
import time
import random

# defining the colours

black = pygame.Color(0, 0, 0)
white = pygame.Color(250, 250, 250)
red = pygame.Color(250, 0, 0)
green = pygame.Color(0, 250, 0)
blue = pygame.Color(0, 0, 250)

# window ka size
winX = 720
winY = 480

snake_speed = 20
pygame.init()

pygame.display.set_caption('Snake Game', 'By KD')
gameWin = pygame.display.set_mode((winX, winY))

fps = pygame.time.Clock()

snakePos = [100, 50]
snakeBody = [[100, 50], [90, 50], [80, 50], [70, 50]]

fruitPos = [random.randrange(1, (winX // 10)) * 10, random.randrange(1, (winY // 10)) * 10]
fruitSpawn = True

direction = 'RIGHT'
change_to = direction

score = 0


def show_score(choice, color, font, size):
    score_font = pygame.font.SysFont(font, size)
    score_surface = score_font.render('Score : ' + str(score), True, color)
    score_rect = score_surface.get_rect()
    gameWin.blit(score_surface, score_rect)


def game_over():
    my_font = pygame.font.SysFont('times new roman', 50)
    game_over_surface = my_font.render('Your Score is : ' + str(score), True, white)
    game_over_rect = game_over_surface.get_rect()
    game_over_rect.midtop = (winX / 2, winY / 4)
    gameWin.blit(game_over_surface, game_over_rect)
    pygame.display.flip()
    time.sleep(2)
    pygame.quit()
    quit()


# Main yaha se hai
while True:

    for event in pygame.event.get():
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_UP:
                change_to = 'UP'
            if event.key == pygame.K_DOWN:
                change_to = 'DOWN'
            if event.key == pygame.K_LEFT:
                change_to = 'LEFT'
            if event.key == pygame.K_RIGHT:
                change_to = 'RIGHT'

    if change_to == 'UP' and direction != 'DOWN':
        direction = 'UP'
    if change_to == 'DOWN' and direction != 'UP':
        direction = 'DOWN'
    if change_to == 'LEFT' and direction != 'RIGHT':
        direction = 'LEFT'
    if change_to == 'RIGHT' and direction != 'LEFT':
        direction = 'RIGHT'

    if direction == 'UP':
        snakePos[1] -= 10
    if direction == 'DOWN':
        snakePos[1] += 10
    if direction == 'LEFT':
        snakePos[0] -= 10
    if direction == 'RIGHT':
        snakePos[0] += 10

    snakeBody.insert(0, list(snakePos))

    if snakePos[0] == fruitPos[0] and snakePos[1] == fruitPos[1]:
        score += 10
        fruitSpawn = False
    else:
        snakeBody.pop()
    if not fruitSpawn:
        fruitPos = [random.randrange(1, (winX // 10)) * 10, random.randrange(1, (winY // 10)) * 10]

    fruitSpawn = True
    gameWin.fill(black)

    for pos in snakeBody:
        pygame.draw.rect(gameWin, green, pygame.Rect(pos[0], pos[1], 10, 10))
    pygame.draw.rect(gameWin, red, pygame.Rect(fruitPos[0], fruitPos[1], 10, 10))

    if snakePos[0] < 0 or snakePos[0] > winX - 10:
        game_over()
    if snakePos[1] < 0 or snakePos[1] > winY - 10:
        game_over()
    for block in snakeBody[1:]:
        if snakePos[0] == block[0] and snakePos[1] == block[1]:
            game_over()

    show_score(1, white, 'times new roman', 20)
    pygame.display.update()
    fps.tick(snake_speed)