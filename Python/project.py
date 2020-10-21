speed (50000)
penup()
setposition(0,200)
pendown()
pensize(5)
def draw_flower():
    for i in range(40):
        right(45)
        for a in range(5):
            if (i % 3)==2: #This if and else block will change the color of the flower to either yellow or pink depending on where it is.
                color("pink")
            else:
                color("yellow")
        forward(200)
        right(60)
#For the codes above, it will draw a flower with yellow and pink lines.
def draw_eyes():
    setposition(-15,100) #This position is for the eyes on the left side of the flower.
    pensize(20)
    color("black")
    pendown()
    forward(1)
    penup()
    setposition(50,100)#This position is on the right side of the flower.
    pendown()
    forward(1)
#For the codes above, it will draw eyes within the flower.
def draw_mouth():
    setposition(75,65) #This position is where the mouth will go, which is below the eyes.
    color("black")
    pensize(10)
    left(150)
    pendown()
    for i in range(180): #This will make a half circle, making it look like a mouth.
        forward(1)
        right(1)
#For the codes above, it will draw a mouth within the flower.
def draw_flower_stem():
    setposition(10,-10) #From line 39-45, it will make the stem on the bottom of the folwer.
    left(32)
    pendown()
    color("green")
    pensize(15)
    left(149)
    forward(170)
    penup()
    setposition(10,-70) #From 47-57, it will make a leaf on the left of the stem.
    right(160)
    color("green")
    pendown()
    for i in range(60):
        left(.8)
        forward(1)
    left(135)
    for i in range (60):
        left(.4)
        forward(1)
#For the code above, it will draw a flower stem on the bottom of the flower and a leaf on the left side of the stem.
def draw_sun():
    setposition(-110,170)
    pendown()
    pensize(1.5)
    for i in range(100):
        right(50)
        if (i % 2)==0:#This if and else block will determine when the sun will have either red or orange lines.
            color("red")
        else:
            color("orange")
        forward(50)
        right(60)
        left(10)
#For the codes above, it will draw a sun onthe top left corner of the screen with red and orange lines.
draw_flower()
penup()
draw_eyes()
penup()
draw_mouth()
penup()  
draw_flower_stem()
penup()
draw_sun()

    

