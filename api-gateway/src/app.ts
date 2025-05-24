import express from 'express';
import cors from 'cors';

import { Application, Request, Response, NextFunction } from 'express';
import { corsOptions } from '@lib/cors';
import { APIs } from '@routes/v1';

class App {
  public readonly app: Application;
  public readonly port: string | number;

  constructor(port: string | number) {
    this.app = express();
    this.port = port;

    this.initMiddlewares();
    this.initRoutes();
    this.initErrorHandling();
  }

  private initMiddlewares(): void {
    this.app.use(cors(corsOptions));
    this.app.use(express.json());
    this.app.use(express.urlencoded({ extended: true }));
  }

  private initRoutes(): void {
    this.app.get('/', (_req: Request, res: Response) => {
      res.send('API is running');
    });
    this.app.use('/api/v1', APIs);
  }

  private initErrorHandling(): void {
    this.app.use(
      (err: Error, _req: Request, res: Response, _next: NextFunction) => {
        console.error(err.stack);
        res.status(500).send('Something broke!');
      }
    );
  }

  public listen() {
    this.app.listen(this.port, () => {
      console.log(`Server running on http://localhost:${this.port}/api/v1`);
    });
  }
}

export default App;
