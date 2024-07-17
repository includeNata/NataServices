import Image from "next/image";

export default function Access() {
  return (
    <main className="w-screen h-screen bg-[#f2f2f2] dark:bg-black pt-32 flex items-center justify-end">
      <section className="w-full h-full flex-col gap-8 px-8 items-center justify-center">
        <div className="flex flex-col items-center gap-1">
          <h1 className="font-bold text-3xl">Login</h1>
          <span className="font-semibold text-base">Faça seu login aqui!</span>
        </div>
        <form className="flex flex-col gap-12 py-4"></form>
      </section>

      <aside className="w-full h-full flex items-center justify-center relative">
        <Image src="/undraw_sign_in_re_o58h.svg" alt="" className="w-[100%!important] h-[80%!important]" fill />
      </aside>
    </main>
  );
}
