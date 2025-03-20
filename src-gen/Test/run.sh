#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp accountvmj.product.test --module-path accountvmj.product.test -m accountvmj.product.test &

wait