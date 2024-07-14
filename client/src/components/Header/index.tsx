"use client"

import Image from "next/image";
import { DropdownMenu, DropdownMenuContent, DropdownMenuItem, DropdownMenuTrigger } from "../ui/dropdown-menu";
import { Button } from "../ui/button";
import { Moon, Sun } from "lucide-react";
import { useTheme } from "next-themes";

export default function Header(){
    const { setTheme } = useTheme();

    return (
        <header className="w-full h-auto flex items-center justify-between px-8 py-2 border-b border-b-[#673AB7] fixed z-10">
            <div className="w-14 h-12 rounded-full relative">
                <Image  src="/logo.svg" alt="logo" className="rounded-full" fill />
            </div>

            <ul className="flex gap-11">
                <li className="cursor-pointer text-lg font-semibold text-red-600">Home</li>
                <li className="cursor-pointer text-lg font-semibold">Jobs</li>
                <li className="cursor-pointer text-lg font-semibold">About</li>
            </ul>

            <div className="flex items-center gap-9">
                <DropdownMenu>
                    <DropdownMenuTrigger asChild>
                        <Button variant="outline" size="icon">
                            <Sun className="h-[1.2rem] w-[1.2rem] rotate-0 scale-100 transition-all dark:-rotate-90 dark:scale-0" />
                            <Moon className="absolute h-[1.2rem] w-[1.2rem] rotate-90 scale-0 transition-all dark:rotate-0 dark:scale-100" />
                            <span className="sr-only">Toggle theme</span>
                        </Button>
                    </DropdownMenuTrigger>
                    <DropdownMenuContent align="end">
                        <DropdownMenuItem onClick={() => setTheme("light")}>
                        Light
                        </DropdownMenuItem>
                        <DropdownMenuItem onClick={() => setTheme("dark")}>
                        Dark
                        </DropdownMenuItem>
                        <DropdownMenuItem onClick={() => setTheme("system")}>
                        System
                        </DropdownMenuItem>
                    </DropdownMenuContent>
                </DropdownMenu>

                <div className="w-auto h-auto flex flex-row items-center justify-center gap-4">
                    <Button className="h-auto bg-white shadow-lg px-6 py-1.5 transition-colors hover:bg-[#673AB7] hover:border-[#673AB7] hover:text-white" variant="primary">
                        Login
                    </Button>

                    <Button
                        className="bg-[#673AB7] border-[#673AB7] py-1.5 text-white h-auto transition-colors hover:bg-white hover:border-white hover:text-black"
                        variant="primary"
                    >
                        Sign up
                    </Button>
                    </div>
                </div>
        </header>
    );
}