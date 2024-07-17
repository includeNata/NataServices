import Image from "next/image";

export default function Home() {
  return (
    <main className="h-screen w-screen py-36 flex items-center justify-start relative">
      <div className="w-[65%] h-auto flex flex-col gap-3 px-16">
        <div className="w-full flex flex-col gap-1 z-10">
          <h1 className="text-5xl font-semibold">Encontre os Melhores Profissionais para Seus Serviços</h1>
          <span className="text-lg text-[#626262] font-semibold">
            Conecte-se com especialistas em diversas áreas e contrate serviços de alta qualidade com facilidade e segurança
          </span>
        </div>

        <button className="w-fit bg-[#1D4ED8] px-6 py-3 text-white text-xl rounded-lg">Procurar Serviços</button>
      </div>

      <div className="w-full h-full absolute z-0">
        <Image src="/rectangle1.png" alt="rectangle1" className="h-[86%!important] w-[51%!important] left-[auto!important] absolute" fill />
        <Image src="/rectangle2.png" alt="rectangle2" className="h-[84%!important] w-[45%!important] left-[auto!important] absolute" fill />
        <Image src="/decoration.png" alt="rectangle2" className="h-[52%!important] w-[33%!important] left-[auto!important] absolute" fill />
      </div>
    </main>
  );
}
