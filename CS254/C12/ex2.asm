#  In each register $1 through $7 set the corresponding bit. That is, in
#  register 1 set bit 1 (and clear the rest to zero), in $2 set bit 2 (and
#  clear the rest to zero), and so on. Use only one ori instruction in your
#  program, to set the bit in register $1.
#
#  ori   $1,$0,0x01
#
#  Don't use any ori instructions other than that one. Note: bit 1 of a register
#  is the second from the right, the one that (in unsigned binary) corresponds
#  to the first power of two.
        .text
        .globl main

main:
        ori $1,$0,0x02
        ori $2,$0,0x04
        ori $3,$0,0x08
        ori $4,$0,0x10
        ori $5,$0,0x20
        ori $6,$0,0x40
        ori $7,$0,0x80
