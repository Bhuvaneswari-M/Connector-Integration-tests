xport const projects = createRouter({ 
 getAll: withAuth.query(({ ctx }) => {
   // ... Get all projects, with pagination
 }),
 getOne: withAuth.input(z.object({ id: z.number() })).query(({ input }) => {
  // ... Get one project with the id
 }),
 checkSlugAvailability: withAuth
   .input(z.object({ slug: z.string(), name: z.string() }))
   .query(async ({ ctx, input }) => {
     const { slug } = input;
     const existingProject = await ctx.prisma.project.findUnique({
       where: {
           slug
       },
     });
     return existingProject ? false : true;
   }),
 // ... others
})
