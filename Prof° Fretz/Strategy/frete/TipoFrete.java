public enum TipoFrete {
    NORMAL{
		@Override
		public IFrete obterFrete() {
			return new Normal();
		}
    },
    SEDEX{
		@Override
		public IFrete obterFrete() {
			return new Sedex();
		}
    },
    SEDEX10
    {
        @Override
        public IFrete obterFrete() {
            return new Sedex10();
        }
        
    };

        public abstract IFrete obterFrete();
}
