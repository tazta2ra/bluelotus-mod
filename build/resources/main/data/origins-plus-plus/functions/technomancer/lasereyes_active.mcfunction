execute as @s run summon falling_block ~ ~1 ~ {NoGravity:1b,BlockState:{Name:"minecraft:barrier"}}
fill ~ ~ ~ ~ ~ ~ air replace cave_air
execute as @e[type=!item,type=!player,distance=..0.8,nbt={Invulnerable:0b}] at @s anchored eyes run particle firework ~ ~ ~ 0 0 0 0.3 2 normal @a
execute as @e[type=!item,type=!player,distance=..0.8,nbt={Invulnerable:0b}] store result score @s entity_health run data get entity @s Health
execute as @e[type=!item,type=!player,distance=..0.8,nbt={Invulnerable:0b}] store result entity @s Health float 1 run scoreboard players remove @s entity_health 1
scoreboard players set #lasers ray_cast 0
execute unless block ~ ~ ~ air unless block ~ ~ ~ bedrock run scoreboard players set #lasers ray_cast 1

execute if score #lasers ray_cast matches 1 run setblock ~ ~ ~ air destroy
particle minecraft:dust 1.0 0.0 0.0 0.5 ^0.2 ^ ^ 0 0 0 0 1 force @a
particle minecraft:dust 1.0 0.0 0.0 0.5 ^-0.2 ^ ^ 0 0 0 0 1 force @a
execute if score #lasers ray_cast matches 0 positioned ^ ^ ^1 if entity @p[distance=..150] run function origins-plus-plus:technomancer/lasereyes_active

kill @e[type=falling_block]